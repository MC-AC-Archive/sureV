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

import me.levansj01.verus.util.bson.BsonBinaryReader;
import me.levansj01.verus.util.bson.BsonBinaryWriter;
import me.levansj01.verus.util.bson.BsonReader;
import me.levansj01.verus.util.bson.BsonWriter;
import me.levansj01.verus.util.bson.RawBsonDocument;
import me.levansj01.verus.util.bson.io.BasicOutputBuffer;
import me.levansj01.verus.util.bson.io.ByteBufferBsonInput;

/**
 * A simple BSONDocumentBuffer codec.  It does not attempt to validate the contents of the underlying ByteBuffer. It assumes that it
 * contains a single encoded BSON document.
 *
 * @since 3.0
 */
public class RawBsonDocumentCodec implements Codec<RawBsonDocument> {

    /**
     * Constructs a new instance.
     */
    public RawBsonDocumentCodec() {
    }

    @Override
    public void encode(final BsonWriter writer, final RawBsonDocument value, final EncoderContext encoderContext) {
        BsonBinaryReader reader = new BsonBinaryReader(new ByteBufferBsonInput(value.getByteBuffer()));
        try {
            writer.pipe(reader);
        } finally {
            reader.close();
        }
    }

    @Override
    public RawBsonDocument decode(final BsonReader reader, final DecoderContext decoderContext) {
        BasicOutputBuffer buffer = new BasicOutputBuffer(0);
        BsonBinaryWriter writer = new BsonBinaryWriter(buffer);
        try {
            writer.pipe(reader);
            return new RawBsonDocument(buffer.getInternalBuffer(), 0, buffer.getPosition());
        } finally {
            writer.close();
            buffer.close();
        }
    }

    @Override
    public Class<RawBsonDocument> getEncoderClass() {
        return RawBsonDocument.class;
    }
}

