package com.intelligrated.download.mapper.switchmapper;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataTypeEnum;

public class StringMapper extends AbstractSwitchMapper {

	public StringMapper(DataObject data) {
		super(DataTypeEnum.STRING, data);
	}

	@Override
	protected void map(String value) {
		getData().setSku(value);
	}

}
