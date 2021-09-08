package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SomethingModel;
import com.example.demo.service.SlowService;

@RestController("/base")
public class TheController {

	@Autowired
	SlowService ss;

	@GetMapping("/getit")
	public SomethingModel getIt(@RequestParam int theNumber) throws InterruptedException {

		return ss.getItSlow(theNumber);

	}

}
