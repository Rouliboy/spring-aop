package org.jvi.app.web;

import org.jvi.app.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aop")
@Component
public class TestController {

	private Logger logger = LoggerFactory.getLogger(getClass().getName());

	@Autowired
	private MyService service;

	@GetMapping("test")
	public String test() {

		logger.info("Return OK");

		service.testService();

		return "OK";
	}
}
