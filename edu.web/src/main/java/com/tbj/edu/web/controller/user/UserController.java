package com.tbj.edu.web.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author bjtang
 * @date   2017��5��18��  
 * @desc
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
	public void index(){
		System.out.println("index");
	}
	
}
