package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Person;

public interface PersonDao {

	public void create(String name, Integer age);

	public Person getPerson(Integer id);

	public List<Person> listPersons();

	public void delete(Integer id);

	public void update(Integer id, Integer age);

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
}
