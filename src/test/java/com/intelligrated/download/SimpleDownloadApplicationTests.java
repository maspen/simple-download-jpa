package com.intelligrated.download;

import java.time.LocalDateTime;

import org.h2.mvstore.cache.CacheLongKeyLIRS.Config;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.intelligrated.download.entity.DataObject;
import com.intelligrated.download.repo.DataObjectRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = SimpleConfig.class)
public class SimpleDownloadApplicationTests {

	@Autowired(required = true)
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
