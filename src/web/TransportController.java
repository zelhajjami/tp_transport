package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import metier.ITansportMetier;

@Controller
public class TransportController {
	@Autowired
	private ITansportMetier metier;
	
	@RequestMapping(value = "/index") //method = "get"
	public String index() {
		return "Transport";
	}
	
	@RequestMapping(value = "/chercher") //method = "get"
	public String chercher(@RequestParam(value = "moCle") String mc, Model model) {
		model.addAttribute("mc", mc);
		model.addAttribute("marchandises", metier.getMarchandiseParMc(mc));
		return "Transport";
	}
}
