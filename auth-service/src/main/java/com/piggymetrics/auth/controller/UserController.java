package com.piggymetrics.auth.controller;

import com.piggymetrics.auth.AuthApplication;
import com.piggymetrics.auth.domain.User;
import com.piggymetrics.auth.service.UserService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
//    private static final Logger logger = Logger.getLogger(AuthApplication.class.getName());

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public Principal getUser(Principal principal) {
//        logger.log(Level.INFO, "getUser");
		return principal;
	}

	@PreAuthorize("#oauth2.hasScope('server')")
	@RequestMapping(method = RequestMethod.POST)
	public void createUser(@Valid @RequestBody User user) {
//        logger.log(Level.INFO, "createUser");
	    userService.create(user);
	}
}
