#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package ${package}.extension.html;

import java.util.LinkedHashMap;
import java.util.Map;

import ${groupId}.Extension;
import ${groupId}.web.extension.AdministrationSectionExt;

/**
 * This class defines the links that will appear on the administration page under the
 * "${parentArtifactId}.title" heading. 
 */
public class AdminList extends AdministrationSectionExt {
	
	/**
	 * @see AdministrationSectionExt${symbol_pound}getMediaType()
	 */
	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}
	
	/**
	 * @see AdministrationSectionExt${symbol_pound}getTitle()
	 */
	public String getTitle() {
		return "${parentArtifactId}.title";
	}
	
	/**
	 * @see AdministrationSectionExt${symbol_pound}getLinks()
	 */
	public Map<String, String> getLinks() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("/module/${parentArtifactId}/manage.form", "${parentArtifactId}.manage");
		return map;
	}
	
}
