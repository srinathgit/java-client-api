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

import java.io.PrintStream;

import com.marklogic.client.util.RequestLogger;

abstract class AbstractLoggingManager {
	protected RequestLogger requestLogger;

	AbstractLoggingManager() {
		super();
	}

	public void startLogging(RequestLogger logger) {
		requestLogger = logger;
	}
	public void stopLogging() {
		if (requestLogger == null) return;

		PrintStream out = requestLogger.getPrintStream();
		if (out != null) out.flush();

		requestLogger = null;
	}
	protected boolean isLoggerEnabled() {
		if (requestLogger != null)
			return requestLogger.isEnabled();

		return false;
	}
	protected PrintStream getPrintLogger() {
		if (requestLogger == null)
			return null;

		return requestLogger.getPrintStream();
	}
}
