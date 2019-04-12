package com.cloud.young.server1.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.young.server1.model.User;

@RequestMapping("/user")
@RestController
public class UserController {

	@RequestMapping("/get")
	@ResponseBody
	public User getUser() {
		return null;
	}
}
