/**
 * 
 */
package com.nalin.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nalin.springbootmongo.api.domain.Person;

/**
 * @author nalin
 *
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

}
