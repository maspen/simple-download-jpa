package com.intelligrated.download;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.mapper.DataMapping;
import com.intelligrated.download.mapper.DataTypeEnum;
import com.intelligrated.download.mapper.Mapper;
import com.intelligrated.download.repo.DataObjectRepository;

@SpringBootApplication
public class SimpleDownloadApplication implements CommandLineRunner {
	
	@SuppressWarnings("serial")
	static ConcurrentMap<String, DataMapping> mappingMap = new ConcurrentHashMap<String, DataMapping>(){{
		put("sku", new DataMapping(6, 10, DataTypeEnum.STRING));
		put("order_number", new DataMapping(0, 6, DataTypeEnum.INTEGER));
		put("ship_date", new DataMapping(16, 23, DataTypeEnum.DATE));
	}};
	
	@Autowired
	private DataObjectRepository dataObjectRepository;
	
	static String timeAsString = LocalDateTime.now().toString();
	//					 [order number][sku][ship date]
	static String line = "123456XYZ6789ABC" + timeAsString;
	// sample date: 2015-11-19T15:30:33.384
	
    public static void main(String[] args) {
        SpringApplication.run(SimpleDownloadApplication.class, args);
    }
    
    @Override
    public void run(String... srings) throws Exception {
    	System.out.println("*** Line: " + line);
        
        DataObject dataObject = Mapper.map(line, mappingMap);
        System.out.println("resulting object:");
        System.out.println(dataObject.toString());
        
        DataObject persistedDataObject = dataObjectRepository.save(dataObject);
        System.out.println("data object persisted, id: " + persistedDataObject.getId());
    }
}
