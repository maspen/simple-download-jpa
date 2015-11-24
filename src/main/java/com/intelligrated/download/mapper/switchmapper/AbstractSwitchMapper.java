package com.intelligrated.download.mapper.switchmapper;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataMapping;
import com.intelligrated.download.mapper.DataTypeEnum;

public abstract class AbstractSwitchMapper {
	private DataTypeEnum type = null;
	private DataObject data = null;
	
	public AbstractSwitchMapper(DataTypeEnum type, DataObject data) {
		this.type = type;
		this.data = data;
	}
	
	protected abstract void map(String value);

	public DataTypeEnum getType() {
		return type;
	}

	public void setType(DataTypeEnum type) {
		this.type = type;
	}

	public DataObject getData() {
		return data;
	}

	public void setData(DataObject data) {
		this.data = data;
	}
}
