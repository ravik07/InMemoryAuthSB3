package com.inmemoryauth.sb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReqControllerClass {
	
	@GetMapping("/public")
	public ResponseEntity<String> publicMethod(){
		String output = "Public permit all Authentication working well";
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminMethod(){
		String output = "this is admin method";
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
	
	@GetMapping(value = "/user")
	public ResponseEntity<String> userAdminMethod(){
		String output = "User and Admin able to access";
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
	
	 @GetMapping("/get")
	    public String getAll(){
	        return "get all employee by admin and users";
	    }


	    @GetMapping("/getApi")
	    public String getAip(){
	    	String output = "get api access by admin able to access";
			return output;
	    }
}
