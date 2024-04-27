package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {

	@RequestMapping("add{num1}and{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
	}
	
	@RequestMapping("sub{num1}and{num2}")
	public int sub(@PathVariable int num1,@PathVariable int num2) {
		return num1-num2;
	}
	
	@RequestMapping("mult{num1}and{num2}")
	public int mult(@PathVariable int num1,@PathVariable int num2) {
		return num1*num2;
	}
	
	@RequestMapping("div{num1}and{num2}")
	public int div(@PathVariable int num1,@PathVariable int num2) {
		return num1/num2;
	}
	
	@RequestMapping("mod{num1}and{num2}")
	public int mod(@PathVariable int num1,@PathVariable int num2) {
		return num1%num2;
	}
}
