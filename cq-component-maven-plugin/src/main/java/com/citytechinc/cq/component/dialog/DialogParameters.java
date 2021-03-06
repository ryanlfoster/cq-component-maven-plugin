/**
 *    Copyright 2013 CITYTECH, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.dialog;

import org.codehaus.plexus.util.StringUtils;

import com.citytechinc.cq.component.dialog.widget.WidgetParameters;

public class DialogParameters extends WidgetParameters {
	private static final String DEFAULT_TITLE = "Dialog";
	private static final String DEFAULT_FILE_NAME = "dialog";
	private static final String XTYPE = "dialog";
	private static final String PRIMARY_TYPE = "cq:Dialog";
	private static final String FIELD_NAME = "jcr:root";
	private String title;
	private String activeTab;
	private String fileName;
	private Integer width;
	private Integer height;

	public String getTitle() {
		if (StringUtils.isEmpty(title)) {
			return DEFAULT_TITLE;
		}
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActiveTab() {
		return activeTab;
	}

	public void setActiveTab(String activeTab) {
		this.activeTab = activeTab;
	}

	public String getFileName() {
		if (StringUtils.isEmpty(fileName)) {
			return DEFAULT_FILE_NAME;
		}
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String getPrimaryType() {
		return PRIMARY_TYPE;
	}

	@Override
	public void setPrimaryType(String primaryType) {
		throw new UnsupportedOperationException("PrimaryType is Static for Dialog");
	}

	@Override
	public String getXtype() {
		return XTYPE;
	}

	@Override
	public void setXtype(String xtype) {
		throw new UnsupportedOperationException("xtype is Static for Dialog");
	}

	@Override
	public String getFieldName() {
		return FIELD_NAME;
	}

	@Override
	public void setFieldName(String fieldName) {
		throw new UnsupportedOperationException("field name is Static for Dialog");
	}
}
