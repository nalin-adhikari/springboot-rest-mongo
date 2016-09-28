/**
 * 
 */
package com.nalin.springbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nalin
 *
 */
@SpringBootApplication(scanBasePackages="com.nalin.springbootmongo")
public class ApplicationBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationBoot.class, args);

	}

}
