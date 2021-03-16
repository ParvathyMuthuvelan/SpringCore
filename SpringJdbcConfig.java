package com.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.PersonDao;
import com.dao.PersonDaoImpl;
import com.service.PersonServiceImpl;

@Configuration
@ComponentScan("com.dao.*,com.service.*")
public class SpringJdbcConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate() {
      JdbcTemplate jdbcTemplate = new JdbcTemplate();
      jdbcTemplate.setDataSource(dataSource());
      return jdbcTemplate;
    }

    @Bean
    public PersonDao personDAO(){
    	PersonDao personDao = new PersonDaoImpl();
      personDao.setJdbcTemplate(jdbcTemplate());
      return personDao;
    }
    @Bean
    public PersonServiceImpl personServiceImpl()
    {
    	PersonServiceImpl  personService=new PersonServiceImpl();
    	return personService;
    	
    }
}
