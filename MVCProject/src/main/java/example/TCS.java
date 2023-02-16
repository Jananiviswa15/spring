package example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TCS {

	//@ResponseBody
	//localhost:dummy.com/opentcs
	@RequestMapping("/openTcs")
	public String display() {
		//return "/WEB-INF/Display/NewFile.html";
		return "NewFile2";
	}
}
