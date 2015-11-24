package com.intelligrated.download.mapper.switchmapper;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataTypeEnum;

public class IntegerMapper extends AbstractSwitchMapper {
	
	public IntegerMapper(DataObject data) {
		super(DataTypeEnum.INTEGER, data);
	}
	
	@Override
	protected void map(String value) {
		getData().setOrderNumber(Integer.valueOf(value));
	}
}
