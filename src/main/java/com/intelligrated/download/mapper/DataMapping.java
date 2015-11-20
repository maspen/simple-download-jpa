package com.intelligrated.download.mapper;

public class DataMapping {
	int indexStart;
	int indexLength;
	DataTypeEnum type;

	public DataMapping(int indexStart, int indexLength, DataTypeEnum type) {
		this.indexStart = indexStart;
		this.indexLength = indexLength;
		this.type = type;
	}
	
	public int getIndexStart() {
		return indexStart;
	}
	public void setIndexStart(int indexStart) {
		this.indexStart = indexStart;
	}
	public int getIndexLength() {
		return indexLength;
	}
	public void setIndexLength(int indexLength) {
		this.indexLength = indexLength;
	}
	public DataTypeEnum getType() {
		return type;
	}
	public void setType(DataTypeEnum type) {
		this.type = type;
	}
}
