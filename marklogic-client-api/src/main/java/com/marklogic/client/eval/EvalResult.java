/*
 * Copyright 2012-2018 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.eval;

import com.marklogic.client.io.Format;
import com.marklogic.client.io.marker.AbstractReadHandle;

/** Represents the content and metadata of a result from a call to
 * {@link ServerEvaluationCall#eval() eval}.
 * Also includes some convenience methods for deserializing the result
 * as a String, Number, Boolean, AbstractReadHandle, or an object of
 * any Class which is registered by a ContentHandle.
 */
public interface EvalResult {
  /** Convenience enum useful for strongly-typed comparison to ensure
   * the result is of the type expected.  This list captures most of
   * the types expected from the X-Primitive header.
   * @see <a href="http://docs.marklogic.com/guide/rest-dev">REST GUIDE -&gt; eval endpoint</a>
   */
  enum Type {
    XML, JSON,
    STRING, BOOLEAN, NULL, OTHER,
    ANYURI, BASE64BINARY, DATE, DATETIME, DECIMAL, DOUBLE, DURATION,
    FLOAT, GDAY, GMONTH, GMONTHDAY, GYEAR, GYEARMONTH, HEXBINARY, INTEGER, QNAME, TIME,
    ATTRIBUTE, BINARY, COMMENT, PROCESSINGINSTRUCTION, TEXTNODE
  };
  /** The {@link Type} of this result from the X-Primitive header
   * provided by the REST API eval endpoint.
   * @see <a href="http://docs.marklogic.com/guide/rest-dev">REST GUIDE -&gt; eval endpoint</a>
   * @return the type of this result
   */
  Type getType();

  /** The format of this result from the Content-Type header
   * provided by the REST API eval endpoint.
   * @see <a href="http://docs.marklogic.com/guide/rest-dev">REST GUIDE -&gt; eval endpoint</a>
   * @return the format of this result
   */
  Format getFormat();

  /** Use a handle to retrieve the contents of this result.
   * @param handle the handle to populate with the contents of this result
   * @param <H> the type of AbstractReadHandle to return
   * @return the handle populated with the contents of this result
   */
  <H extends AbstractReadHandle> H get(H handle);

  /** An io shortcut method to get the contents as an object
   * of the specified type, which must be a registered type.
   * @param clazz the Class (type). This type must be registered by an io handle.
   * @param <T> the type of object that will be returned by the handle registered for it
   * @return an instance of the requested type populated with the contents of this result
   */
  <T> T getAs(Class<T> clazz);

  /** This result directly as a string.
   * @return this result as a string
   */
  String getString();

  /** This result parsed to a Number.
   * @return this result as a number
   */
  Number getNumber();

  /** This result parsed to a Boolean.
   * @return a boolean as generated by new Boolean({@link #getString getString()})
   */
  Boolean getBoolean();
}
