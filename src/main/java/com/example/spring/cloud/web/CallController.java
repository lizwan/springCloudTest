package com.example.spring.cloud.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by naver on 17. 1. 6..
 */
@RestController
public class CallController {

	@RequestMapping("/hi")
	public String test() {
		return "hi zwan";
	}
}
