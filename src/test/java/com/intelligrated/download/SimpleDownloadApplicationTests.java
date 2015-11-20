package com.intelligrated.download;

import java.time.LocalDateTime;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.intelligrated.download.config.Config;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//@SpringApplicationConfiguration(classes = SimpleDownloadApplication.class)
@ContextConfiguration(classes = Config.class)
public class SimpleDownloadApplicationTests {

	@Autowired
	DataObjectRepository repository;
	DataObject dataObject;
	
	@Before
	public void setup() {
		dataObject = new DataObject(12345, "ABCDEFG", LocalDateTime.now());
	}
	
	@Test
	public void saveDataObject() {
		DataObject persistedDataObject = repository.save(dataObject);
		
		//assertThat(persistedDataObject, is(dataObject));
		Assert.assertNotNull(persistedDataObject);
	}

}
