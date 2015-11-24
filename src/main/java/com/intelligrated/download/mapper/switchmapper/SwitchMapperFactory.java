package com.intelligrated.download.mapper.switchmapper;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataMapping;

public class SwitchMapperFactory {
	
	public static void map(String value, DataMapping mapping, DataObject data) {
		AbstractSwitchMapper mapper = null;
		switch(mapping.getType()) {
			case STRING:
			mapper = new StringMapper(data);
			mapper.map(value);
			break;
			
			case DATE:
			mapper = new DateMapper(data);
			mapper.map(value);
			break;
			
			case INTEGER:
			mapper = new IntegerMapper(data);
			mapper.map(value);
			break;
			
			default:
			System.out.println("unknown type in AbstractSwitchMapper");
		}
	}
}
