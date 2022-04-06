package spring.profiling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
	@Autowired
	MyApplicationBean myApplicationBean;
	
	@Autowired
	EnvInterface myEnvBean;
	
	/*
	@Value("${my.message}")
	private String message;
	@Value("${my.usercount}")
	private int userCount;
	@Value("${my.contactinfo}")
	private String contactInfo;
	*/
	
	@GetMapping("/profiles-App-Learning")
	 public String welcome()
	 {
		// return this.message + " and i have " + userCount + " number of users " + " my contact info is " + this.contactInfo;
	    return this.myEnvBean + " is being loaded "+"heynish "+ myApplicationBean.getMessage() + "\n" + myApplicationBean.getContactinfo() + "\n" + myApplicationBean.getUsercount() + "\n" +myApplicationBean.getEnv() + "\n" + myApplicationBean.getThankyoumessage();
	 }
}
