package com.intelligrated.download.repo;

import java.time.LocalDateTime;

import org.springframework.data.repository.Repository;

import com.intelligrated.download.entity.DataObject;

//public interface DataObjectRepository extends CrudRepository<DataObject, Long> {
public interface DataObjectRepository extends Repository<DataObject, Long> {
	// get a lot of stuff for free
	// put custom queries here
	DataObject save(DataObject dataObject);
	
//	Iterable<DataObject> findByOrderNumber(Integer orderNumber);
//	
//	Iterable<DataObject> finaBySku(String sku);
//	
//	Iterable<DataObject> findByShipDate(LocalDateTime shipDate);
}
