package com.example.demo.resources;

import io.swagger.annotations.Api;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource REST Endpoint", description = "<br> Check the below Endpoints for UserDetails")
public class UserDetails {

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return Arrays.asList(new User("Himanshu", "xyz"), new User("Upadhyay", "abc"), new User(
				"Himanshu", "jhg"));
	}

	@GetMapping("username/{userName}")
	public User getUser() {
		return new User("Himanshu", "xyz");
	}
	
	@GetMapping("/lastModified")
	public Calendar getLastModified()
	{
		return Calendar.getInstance();
	}



}
