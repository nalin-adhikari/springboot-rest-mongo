/**
 * 
 */
package com.nalin.springbootmongo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nalin
 *
 */
@RestController
@RequestMapping("/")
public class TestController {

	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "Server is running !";
	}
}
