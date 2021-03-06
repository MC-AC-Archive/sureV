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

import java.io.StringWriter;

import me.levansj01.verus.util.bson.BsonReader;
import me.levansj01.verus.util.bson.BsonWriter;
import me.levansj01.verus.util.bson.json.JsonObject;
import me.levansj01.verus.util.bson.json.JsonReader;
import me.levansj01.verus.util.bson.json.JsonWriter;
import me.levansj01.verus.util.bson.json.JsonWriterSettings;

/**
 * Encodes and Decodes JSON object strings.
 *
 * @since 4.2
 */
public class JsonObjectCodec implements Codec<JsonObject> {
    private final JsonWriterSettings writerSettings;

    /**
     * Construct a JsonObjectCodec with default JsonWriterSettings
     */
    public JsonObjectCodec() {
        this(JsonWriterSettings.builder().build());
    }

    /**
     * Construct a JsonObjectCodec with provided JsonWriterSettings
     *
     * @param writerSettings the settings
     */
    public JsonObjectCodec(final JsonWriterSettings writerSettings) {
        this.writerSettings = writerSettings;
    }

    @Override
    public void encode(final BsonWriter writer, final JsonObject value, final EncoderContext encoderContext) {
        writer.pipe(new JsonReader(value.getJson()));
    }

    @Override
    public JsonObject decode(final BsonReader reader, final DecoderContext decoderContext) {
        StringWriter stringWriter = new StringWriter();
        new JsonWriter(stringWriter, writerSettings).pipe(reader);
        return new JsonObject(stringWriter.toString());
    }

    @Override
    public Class<JsonObject> getEncoderClass() {
        return JsonObject.class;
    }

}
