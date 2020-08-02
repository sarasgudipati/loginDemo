package com.login.logindemo.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.logindemo.login.dto.Response;
import com.login.logindemo.login.dto.Save;
import com.login.logindemo.login.dto.UserDetails;

@RestController
@RequestMapping("/api/")
public class LoginController {

	@GetMapping("v1/login")
	@ResponseBody
	public Boolean validateUser(@RequestParam(name="values") String values) {
		System.out.println("hello");
		if (values.equalsIgnoreCase("ravi"))
			return true;
		return false;

	}

	@PostMapping("v1/save")
	@ResponseBody
	public Response<?> saveData(@RequestBody UserDetails userDetail){
		Response<Save>  response = new Response<>();
		response.setResponse(new Save(userDetail.getFirstName()+" "+userDetail.getLastName()));
		System.out.println(userDetail.toString());
		return response;
		
	}
}
