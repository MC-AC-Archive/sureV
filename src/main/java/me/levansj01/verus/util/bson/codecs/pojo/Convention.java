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

package me.levansj01.verus.util.bson.codecs.pojo;

/**
 * Defines a convention to be applied when mapping a class.
 *
 * @since 3.5
 */
public interface Convention {

    /**
     * This method applies this Convention to the given ClassModelBuilder
     *
     * @param classModelBuilder the ClassModelBuilder to apply the convention to
     */
    void apply(ClassModelBuilder<?> classModelBuilder);

}
