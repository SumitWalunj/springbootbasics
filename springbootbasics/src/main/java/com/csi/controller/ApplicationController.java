package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String sayHello() {

		return "Welcome to Fintech CSI";
	}

	@GetMapping("/services")
	public String sayService() {

		return "Software Testing";
	}

	@GetMapping("/address")
	public String sayAddress() {

		return "Khed | Pune | MH | India";
	}

	@GetMapping("/listofemployee")
	public List<Employee> getAllData() {

		return Stream.of(new Employee(121, "Sumit", 62000), new Employee(122, "Amit", 50000))
				.collect(Collectors.toList());

	}
}
