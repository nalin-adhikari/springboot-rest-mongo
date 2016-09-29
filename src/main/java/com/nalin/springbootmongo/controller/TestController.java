/**
 * 
 */
package com.nalin.springbootmongo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author nalin
 *
 */
@RequestMapping("/")
public class TestController {

	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "Server is running !";
	}
}
