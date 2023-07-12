package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controllertest {
	@GetMapping("/")
	   public String getMessage() {
		   return "welcome to docker application";
	   }
}
