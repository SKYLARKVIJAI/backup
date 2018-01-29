package com.sl.chocolatelovebackend.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableTransactionManagement
public class DBConfiguration {
	@Autowired
	 @Bean(name="datasource")
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.h2.Driver");
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/skylark");
	        dataSource.setUsername("chocolate94");
	        dataSource.setPassword("VIJAY@143");
	        return dataSource;
	    }
	 
	@Autowired
	 @Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory()
	 {
		 LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(dataSource());
		 localSessionFactoryBuilder.scanPackages("com.sl.chocolatelovebackend.model");
		 localSessionFactoryBuilder.setProperty("hibernate.show_sql", "true");
		 localSessionFactoryBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		 localSessionFactoryBuilder.setProperty("hibernate.hbm2ddl.auto", "update");
		 return localSessionFactoryBuilder.buildSessionFactory();
	 }

}
