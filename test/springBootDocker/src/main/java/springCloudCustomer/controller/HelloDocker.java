package springCloudCustomer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloDocker {
	
	@GetMapping("/helloDocker")
	public String helloDocker() {
		log.info("helloDocker {}", "argument1");
		return "helloDocker";
	}
}
