package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonDao;
import com.model.Person;

@Service
public class PersonServiceImpl {
	@Autowired
	PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void create(String name, Integer age) 
	{
		personDao.create(name, age);
	}

	public List<Person> listPersons() {
		List<Person> list=personDao.listPersons();
		return list;
	}
	}

