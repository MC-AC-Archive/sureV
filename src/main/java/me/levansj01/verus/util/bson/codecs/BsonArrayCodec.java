/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.levansj01.verus.util.bson.codecs;

import static me.levansj01.verus.util.bson.assertions.Assertions.notNull;
import static me.levansj01.verus.util.bson.codecs.configuration.CodecRegistries.fromProviders;

import java.util.ArrayList;
import java.util.List;

import me.levansj01.verus.util.bson.BsonArray;
import me.levansj01.verus.util.bson.BsonReader;
import me.levansj01.verus.util.bson.BsonType;
import me.levansj01.verus.util.bson.BsonValue;
import me.levansj01.verus.util.bson.BsonWriter;
import me.levansj01.verus.util.bson.codecs.configuration.CodecRegistry;

/**
 * A codec for BsonArray instances.
 *
 * @since 3.0
 */
public class BsonArrayCodec implements Codec<BsonArray> {

    private static final CodecRegistry DEFAULT_REGISTRY = fromProviders(new BsonValueCodecProvider());

    private final CodecRegistry codecRegistry;

    /**
     * Creates a new instance with a default codec registry that uses the {@link BsonValueCodecProvider}.
     *
     * @since 3.4
     */
    public BsonArrayCodec() {
        this(DEFAULT_REGISTRY);
    }

    /**
     * Construct an instance with the given registry
     *
     * @param codecRegistry the codec registry
     */
    public BsonArrayCodec(final CodecRegistry codecRegistry) {
        this.codecRegistry = notNull("codecRegistry", codecRegistry);
    }

    @Override
    public BsonArray decode(final BsonReader reader, final DecoderContext decoderContext) {
        reader.readStartArray();

        List<BsonValue> list = new ArrayList<BsonValue>();
        while (reader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            list.add(readValue(reader, decoderContext));
        }

        reader.readEndArray();

        return new BsonArray(list);
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void encode(final BsonWriter writer, final BsonArray array, final EncoderContext encoderContext) {
        writer.writeStartArray();

        for (BsonValue value : array) {
            Codec codec = codecRegistry.get(value.getClass());
            encoderContext.encodeWithChildContext(codec, writer, value);
        }

        writer.writeEndArray();
    }

    @Override
    public Class<BsonArray> getEncoderClass() {
        return BsonArray.class;
    }

    /**
     * This method may be overridden to change the behavior of reading the current value from the given {@code BsonReader}.  It is required
     * that the value be fully consumed before returning.
     *
     * @param reader the read to read the value from
     * @param decoderContext the decoder context
     * @return the non-null value read from the reader
     */
    protected BsonValue readValue(final BsonReader reader, final DecoderContext decoderContext) {
        return codecRegistry.get(BsonValueCodecProvider.getClassForBsonType(reader.getCurrentBsonType())).decode(reader, decoderContext);
    }

}
