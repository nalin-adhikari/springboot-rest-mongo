/**
 * 
 */
package com.nalin.springbootmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nalin.springbootmongo.api.PersonManager;
import com.nalin.springbootmongo.api.domain.Person;

/**
 * @author nalin
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private PersonManager personManager;

	@RequestMapping(method=RequestMethod.GET)
	public List<Person> getAll(){
		
		return personManager.findAll();
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Person getOne(@PathVariable("id") String id){
		
		return personManager.find(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Person addOne(@RequestBody Person person){
		
		return personManager.addNew(person);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public List<Person> addAll(@RequestBody List<Person> persons){
		
		return personManager.addAll(persons);
		
	}
	
}
