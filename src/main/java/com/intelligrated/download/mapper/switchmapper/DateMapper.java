package com.intelligrated.download.mapper.switchmapper;

import java.time.LocalDateTime;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataTypeEnum;

public class DateMapper extends AbstractSwitchMapper {

	public DateMapper(DataObject data) {
		super(DataTypeEnum.DATE, data);
	}
	
	@Override
	protected void map(String value) {
		getData().setShipDate(LocalDateTime.parse(value));
	}

}
