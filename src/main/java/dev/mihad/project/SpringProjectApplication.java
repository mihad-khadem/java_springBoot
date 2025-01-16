package dev.mihad.project;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}


	// hello controller
	@RestController
	 public class HelloController {
	 // get mapping
	@GetMapping("/hello")
	public List<String> getHello() {
		return List.of("hello","world")	;
	}
 }

}
