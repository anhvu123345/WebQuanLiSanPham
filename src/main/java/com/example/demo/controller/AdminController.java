package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping(value="/admin")
	public String admin() {
		return "admin/dashboard";
	}
	
	@GetMapping(value="/admin/addcata")
	public String addcategory() {
		return "admin/category_form";
	}

	@GetMapping(value="/admin/listcata")
	public String liscate() {
		return "admin/category_list";
	}
	
	@GetMapping(value="/admin/listproduct")
	public String listproduct() {
		return "admin/product_list";
	}
	
	@GetMapping(value="/admin/addproduct")
	public String addproduct() {
		return "admin/product_form";
	}
}
