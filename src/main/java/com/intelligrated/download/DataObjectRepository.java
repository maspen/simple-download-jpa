package com.intelligrated.download;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;

public interface DataObjectRepository extends CrudRepository<DataObject, Long> {
	// get a lot of stuff for free
	// put custom queries here
	Iterable<DataObject> findByOrderNumber(Integer orderNumber);
	
	Iterable<DataObject> finaBySku(String sku);
	
	Iterable<DataObject> findByShipDate(LocalDateTime shipDate);
}
