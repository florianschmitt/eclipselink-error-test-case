package com.explicatis;

import javax.persistence.SharedCacheMode;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

@Configuration
public class SpringConfiguration
{

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory1()
	{
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setPersistenceUnitName("PU1");
		emf.setPackagesToScan(new String[]{"com.explicatis.datamodel"});
		emf.setDataSource(primaryDataSource());
		emf.setJpaVendorAdapter(vendorAdapter1());
		emf.setSharedCacheMode(SharedCacheMode.ENABLE_SELECTIVE);
		return emf;
	}

	@Bean
	public EclipseLinkJpaVendorAdapter vendorAdapter1()
	{
		EclipseLinkJpaVendorAdapter result = new EclipseLinkJpaVendorAdapter();
		result.setGenerateDdl(true);
		return result;
	}

	@Bean
	@Primary
	// @ConfigurationProperties(prefix = "datasource.primary")
	public DataSource primaryDataSource()
	{
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
		// DataSourceBuilder.create().
		// EmbeddedDatabaseBuilder
		// return DataSourceBuilder.create().build();
	}
}
