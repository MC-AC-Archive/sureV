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

package me.levansj01.verus.util.bson;

/**
 * Represent the minimum key value regardless of the key's type
 */
public final class BsonMinKey extends BsonValue {

    @Override
    public BsonType getBsonType() {
        return BsonType.MIN_KEY;
    }

    @Override
    public boolean equals(final Object o) {
        return o instanceof BsonMinKey;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "BsonMinKey";
    }

}
