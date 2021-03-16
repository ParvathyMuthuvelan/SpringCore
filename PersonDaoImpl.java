package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Person;
@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}

	public void create(String name, Integer age) {
		String SQL = "insert into person (name, age) values (?, ?)";
		jdbcTemplate.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);

	}

	public Person getPerson(Integer id) {
		String SQL = "select * from person where id = ?";
		Person person = jdbcTemplate.queryForObject(SQL, new Object[] { id }, new PersonMapper());
		return person;
	}

	public List<Person> listPersons() {
		String SQL = "select * from person";
		List<Person> personList = jdbcTemplate.query(SQL, new PersonMapper());
		return personList;
	}

	public void delete(Integer id) {

		String SQL = "delete from person where id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;

	}

	public void update(Integer id, Integer age) {
		String SQL = "update person set age = ? where id = ?";
		jdbcTemplate.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;

	}

	

}
