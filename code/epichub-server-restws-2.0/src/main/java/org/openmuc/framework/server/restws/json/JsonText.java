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

public abstract class JsonText implements JsonWriter {

	protected String jsonText;

	public JsonText() {
		this.jsonText = "";
	}

	public String getJsonText() {
		return this.jsonText;
	}

	public void setJsonText(String jText) {
		this.jsonText = jText;
	}

	public void appendJsonText(String jText) {
		this.jsonText += jText;
	}

	public int determineNbrTab() {
		int nbrTabs = 0;
		nbrTabs = this.jsonText.length() - this.jsonText.replace("{", "").length();
		nbrTabs += this.jsonText.length() - this.jsonText.replace("[", "").length();
		nbrTabs -= this.jsonText.length() - this.jsonText.replace("}", "").length();
		nbrTabs -= this.jsonText.length() - this.jsonText.replace("]", "").length();

		return nbrTabs;
	}

}
