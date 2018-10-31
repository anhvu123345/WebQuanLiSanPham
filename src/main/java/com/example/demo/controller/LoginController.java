package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;

@Controller
public class LoginController {

	@GetMapping(value="/login")
	public String login(@PathParam("user") User user) {
		
		
		return "web/login";
	}
}
