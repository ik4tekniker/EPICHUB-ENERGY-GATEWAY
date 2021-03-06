/*
 * Copyright 2011-14 Fraunhofer ISE
 *
 * This file is part of OpenMUC.
 * For more information visit http://www.openmuc.org
 *
 * OpenMUC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenMUC is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenMUC.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.openmuc.framework.server.restws.json;

import java.util.Collection;
import java.util.LinkedHashMap;

public class JsonObjectMap {

	LinkedHashMap<JsonFieldInformation, String> JsonMap = new LinkedHashMap<JsonFieldInformation, String>();

	public JsonObjectMap() {

	}

	public LinkedHashMap<JsonFieldInformation, String> getJsonObjectMap() {
		return this.JsonMap;
	}

	public void put(JsonFieldInformation jfi, String tmpValue) {
		getJsonObjectMap().put(jfi, tmpValue);
	}

	public String get(JsonFieldInformation jfi) {
		return getJsonObjectMap().get(jfi);
	}

	public Collection<? extends JsonFieldInformation> keySet() {

		return getJsonObjectMap().keySet();
	}
}
