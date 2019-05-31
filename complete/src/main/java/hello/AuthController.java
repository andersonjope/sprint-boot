package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping("/authorize")
	public String authorize() {
		return "authorize";
	}
	
	@RequestMapping("/token")
	public String token() {
		return "token";
	}

}
