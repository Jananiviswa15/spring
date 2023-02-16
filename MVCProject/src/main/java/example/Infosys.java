package example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Infosys {
	
	//@ResponseBody
	@RequestMapping("/openInfi")
	public String display() {
		return "NewFile";
	}
}
