package com.intelligrated.download.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableJpaRepositories
@EnableAutoConfiguration
public class Config {

//	@Bean
//	public DataSource dataSource() {
//		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//		return builder.setType(EmbeddedDatabaseType.H2).build();
//	}
//	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		vendorAdapter.setDatabase(Database.H2);
//		vendorAdapter.setGenerateDdl(true);
//		
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//		factory.setJpaVendorAdapter(vendorAdapter);
//		factory.setPackagesToScan(getClass().getPackage().getName());
//		factory.setDataSource(dataSource());
//		
//		return factory;
//	}
//	
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		JpaTransactionManager manager = new JpaTransactionManager();
//		manager.setEntityManagerFactory((EntityManagerFactory) entityManagerFactory());
//		return manager;
//	}
}
