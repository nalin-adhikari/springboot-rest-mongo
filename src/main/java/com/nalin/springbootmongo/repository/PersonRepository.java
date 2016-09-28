/**
 * 
 */
package com.nalin.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nalin.springbootmongo.api.domain.Person;

/**
 * @author nalin
 *
 */
public interface PersonRepository extends MongoRepository<Person, String>{

}
