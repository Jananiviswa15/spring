package example;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/processing")
	public String toprocessdata(HttpServletRequest request, Model anymodel) {
		String name = request.getParameter("customername");
		anymodel.addAttribute("passedValue", name);
		return "NewFile3";
	}
}
