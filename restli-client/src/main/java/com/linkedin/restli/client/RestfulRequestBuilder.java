/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 *
 */
package com.linkedin.restli.client;


import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.common.ResourceSpec;

import java.util.Map;


/**
 * @author adubman
 *
 */
public abstract class RestfulRequestBuilder<K, V extends RecordTemplate, R extends Request<?>> extends
    AbstractRequestBuilder<K, V, R>
{
  @Deprecated
  protected RestfulRequestBuilder(String baseURITemplate, ResourceSpec resourceSpec)
  {
    this(baseURITemplate, resourceSpec, RestliRequestOptions.DEFAULT_OPTIONS);
  }

  protected RestfulRequestBuilder(String baseURITemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions)
  {
    super(baseURITemplate, resourceSpec, requestOptions);
  }

  /**
   * Create a header with the specified value if there is no existing name
   * Otherwise, overwrite the existing header with the specified value to the existing value
   *
   * @param name name of the header
   * @param value value of the header
   */
  @Override
  @Deprecated
  public RestfulRequestBuilder<K, V, R> header(String name, String value)
  {
    super.setHeader(name, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> setHeader(String key, String value)
  {
    super.setHeader(key, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> setHeaders(Map<String, String> headers)
  {
    super.setHeaders(headers);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> addHeader(String name, String value)
  {
    super.addHeader(name, value);
    return this;
  }

  /**
   * Note that this method overrides the value at the given key, rather than adds to the
   * collection of values for it.
   */
  @Deprecated
  public RestfulRequestBuilder<K, V, R> param(String key, Object value)
  {
    super.setParam(key, value);
    return this;
  }

  /**
   * Note that this method overrides the value at the given key, rather than adds to the
   * collection of values for it.
   */
  @Deprecated
  public RestfulRequestBuilder<K, V, R> reqParam(String key, Object value)
  {
    super.setReqParam(key, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> setParam(String key, Object value)
  {
    super.setParam(key, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> setReqParam(String key, Object value)
  {
    super.setReqParam(key, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> addParam(String key, Object value)
  {
    super.addParam(key, value);
    return this;
  }

  @Override
  public RestfulRequestBuilder<K, V, R> addReqParam(String key, Object value)
  {
    super.addReqParam(key, value);
    return this;
  }
}
