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
	public String index(Model model) {
		model.addAttribute("cargaisons", metier.getAllCargaison());
		return "Transport";
	}
	
	@RequestMapping(value = "/chercher")
	public String chercher(@RequestParam(value = "motCle") String mc, Model model) {
		model.addAttribute("mc", mc);
		model.addAttribute("marchandises", metier.getMarchandiseParMc(mc));
		return "Transport";
	}
	
	@RequestMapping(value = "/marchandisesParCarg")
	public String marchandises(@RequestParam(value = "refCarg") String ref, Model model) {
		model.addAttribute("refCarg", ref);
		model.addAttribute("marchandises", metier.getMarchandise(ref));
		model.addAttribute("cargaisons", metier.getAllCargaison());
		return "Transport";
	}
}
