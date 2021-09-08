package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.SomethingModel;

@Service
public class SlowService {

	@Cacheable(cacheNames = "cacheOfSomething")
	public SomethingModel getItSlow(int theNumber) throws InterruptedException {
		SomethingModel sm = new SomethingModel();
		sm.setName("dumb dumb");
		sm.setKeyNumber(theNumber);
		Thread.sleep(5000);
		return sm;

	}

}
