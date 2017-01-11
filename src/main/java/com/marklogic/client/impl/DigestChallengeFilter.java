/*
 * Copyright 2012-2017 MarkLogic Corporation
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

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * DigestChallengeFilter is a work around for a Jersey bug: http://java.net/jira/browse/JERSEY-1445
 */
class DigestChallengeFilter extends ClientFilter {
	DigestChallengeFilter() {
		super();
	}

	@Override
	public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
        ClientResponse response = getNext().handle(request);

        if (response.getClientResponseStatus() == Status.UNAUTHORIZED) {
        	// NOTE: ApacheHttpClient4Handler.handle() also calls response.bufferEntity()
        	response.close();
        }

		return response;
	}
}
