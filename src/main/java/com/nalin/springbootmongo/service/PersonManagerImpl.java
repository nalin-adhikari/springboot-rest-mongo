/**
 * 
 */
package com.nalin.springbootmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nalin.springbootmongo.api.PersonManager;
import com.nalin.springbootmongo.api.domain.Person;
import com.nalin.springbootmongo.repository.PersonRepository;

/**
 * @author nalin
 *
 */
@Service
public class PersonManagerImpl implements PersonManager {

	@Autowired
	private PersonRepository personRepository;
	
	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#addNew(java.io.Serializable)
	 */
	@Override
	public Person addNew(Person t) {
		
		return this.personRepository.save(t);
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#addAll(java.util.List)
	 */
	@Override
	public List<Person> addAll(List<Person> list) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#update(java.io.Serializable)
	 */
	@Override
	public Person update(Person t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#remove(java.io.Serializable)
	 */
	@Override
	public Person remove(Person t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#removeBy(java.io.Serializable)
	 */
	@Override
	public void removeBy(String id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#find(java.io.Serializable)
	 */
	@Override
	public Person find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#findAll()
	 */
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#findWithPaging(int, int)
	 */
	@Override
	public List<Person> findWithPaging(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nalin.springbootmongo.api.CrudManager#countRecord()
	 */
	@Override
	public Long countRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
