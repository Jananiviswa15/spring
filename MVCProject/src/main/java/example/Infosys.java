package example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Infosys {
	
	//@ResponseBody
	@RequestMapping("/openInfi")
	public String display(Model model) {
		String greetMsg = "welcome to my page....";
		model.addAttribute("message",greetMsg );
		return "NewFile";
	}
}
