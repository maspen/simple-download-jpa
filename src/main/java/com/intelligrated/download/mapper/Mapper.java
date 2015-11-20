package com.intelligrated.download.mapper;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.intelligrated.download.entity.DataObject;

public class Mapper {
	public static DataObject map(String line, ConcurrentMap<String, DataMapping> mapping) {
		DataObject dataObject = new DataObject();
		for (Map.Entry<String,DataMapping> entry : mapping.entrySet()) {
			
			DataMapping dataMapping = entry.getValue();
			int indexStart = dataMapping.getIndexStart();
			int endIndex = (indexStart + dataMapping.getIndexLength());
			DataTypeEnum type = dataMapping.getType();
			
			//System.out.println(indexStart + ":" + endIndex);
			String value = line.substring(indexStart, endIndex);
			//System.out.println("value: " + value);
			
			switch(type) {
				case STRING:
					//System.out.println("STRING");
					dataObject.setSku(value);
					break;
				case DATE:
					//System.out.println("DATE");
					dataObject.setShipDate(LocalDateTime.parse(value));
					break;
				case INTEGER:
					//System.out.println("INTEGER");
					dataObject.setOrderNumber(Integer.valueOf(value));
					break;
				default:
					System.out.println("unknown type");
					break;
			}
		}
		return dataObject;
	}
}
