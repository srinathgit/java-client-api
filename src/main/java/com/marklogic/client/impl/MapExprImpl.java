/*
 * Copyright 2016 MarkLogic Corporation
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
package com.marklogic.client.impl;

import com.marklogic.client.impl.BaseTypeImpl.BaseArgImpl;
import com.marklogic.client.impl.BaseTypeImpl.BaseCallImpl;
import com.marklogic.client.type.MapMapExpr;

// TODO: replace placeholder with interface generated from signatures of functions in namespace
public class MapExprImpl {
   	static class MapMapCallImpl extends BaseCallImpl<BaseArgImpl> implements MapMapExpr {
   		MapMapCallImpl(String fnPrefix, String fnName, Object[] fnArgs) {
            super(fnPrefix, fnName, BaseTypeImpl.convertList(fnArgs));
    	}
    	
    }
}
