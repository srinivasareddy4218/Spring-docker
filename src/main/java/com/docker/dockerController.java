package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

	@GetMapping("/getmessage/{name}")
	public String getmessage(@PathVariable String name) {
		return "welcome to docker "+name;
	}
}
