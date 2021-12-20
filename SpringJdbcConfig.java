package com.springjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.PersonDao;
import com.dao.PersonDaoImpl;
import com.service.PersonServiceImpl;

@Configuration
//@ComponentScan("com.dao.*,com.service.*")
@PropertySource("classpath:db.properties")
public class SpringJdbcConfig {
	@Autowired
	Environment environment;
	private final String URL = "db.url";
	private final String USER = "db.username";
	private final String DRIVER = "db.driver";
	private final String PASSWORD = "db.password";
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty(URL));
        dataSource.setUsername(environment.getProperty(USER));
        dataSource.setPassword(environment.getProperty(PASSWORD));
        dataSource.setDriverClassName(environment.getProperty(DRIVER));
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");

        return dataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate() {
      JdbcTemplate jdbcTemplate = new JdbcTemplate();
      jdbcTemplate.setDataSource(getDataSource());
      return jdbcTemplate;
    }

    @Bean
    public PersonDao getPersonDao(){
    	PersonDao personDao = new PersonDaoImpl();
       personDao.setJdbcTemplate(getJdbcTemplate());
      return personDao;
    }
    @Bean(name="personService")
    public PersonServiceImpl getPersonServiceImpl()
    {
    	PersonServiceImpl  personService=new PersonServiceImpl();
    	return personService;
    	
    }
}
