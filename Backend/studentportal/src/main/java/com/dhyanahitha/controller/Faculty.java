package com.dhyanahitha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/faculty")
public class Faculty {

		@RequestMapping("/one")
		public String one() {
			return "Hello";
		}
}
