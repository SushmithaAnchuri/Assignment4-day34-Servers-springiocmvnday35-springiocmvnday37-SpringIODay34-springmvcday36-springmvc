package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

@RequestMapping(value="go",method=RequestMethod.GET)	
public String method(ModelMap map) {
	
	map.put("username","sushmitha");
	map.put("password", "12345");
	map.put("otp", "9090");
	return "user";
}
}	

