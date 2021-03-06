/**
 * Copyright 1999-2014 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.rpc.protocol.rest.support;

import javax.ws.rs.core.MediaType;

/**
 * @author lishen
 */
public class ContentType {

    public static final String APPLICATION_JSON_UTF_8 = MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8";
    public static final String TEXT_XML_UTF_8 = MediaType.TEXT_XML + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8";
    public static final String TEXT_PLAIN_UTF_8 = MediaType.TEXT_PLAIN + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8";

    public static final String APPLICATION_JSON_GBK = MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=GBK";
    public static final String TEXT_XML_GBK = MediaType.TEXT_XML + "; " + MediaType.CHARSET_PARAMETER + "=GBK";
    public static final String TEXT_PLAIN_GBK = MediaType.TEXT_PLAIN + "; " + MediaType.CHARSET_PARAMETER + "=GBK";
}
