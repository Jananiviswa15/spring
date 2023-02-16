package example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/google")
public class Google {
	
	@ResponseBody
	@RequestMapping("/openGoogle")
	public String display() {
		return "i am from google...";
	}
	
	@ResponseBody
	@RequestMapping("/sayHi")
	public String displayHiMessage() {
		return "hi all...";
	}
	
	
}
