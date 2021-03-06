/*
 * Copyright (c) 2016 ingenieux Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ingenieux.lambada.runtime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>Represents a Patch Operation, according to RFC 6902.</p>
 *
 * @see <a href="https://jsonpatch.com/">jsonpatch.com</a>
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Patch {
  enum PatchType {
    Add,
    Remove,
    Replace,
    Move,
  }

  PatchType patchType();

  String path();

  String patchValue() default "";

  String from() default "";
}
