package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import metier.ITansportMetier;

@Controller
@SessionAttributes({"cargaisons"}) // tableau de sessions: Spring
								   // problème: si on ajoute autre cargaison il va pas être partie de la liste 
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
		//model.addAttribute("cargaisons", metier.getAllCargaison());
		return "Transport";
	}
	
	@RequestMapping(value = "/marchandisesParCarg")
	public String marchandises(@RequestParam(value = "refCarg") String ref, Model model) {
		model.addAttribute("refCarg", ref);
		model.addAttribute("marchandises", metier.getMarchandise(ref));
		//model.addAttribute("cargaisons", metier.getAllCargaison());
		return "Transport";
	}
	
	@RequestMapping(value = "/deleteMarch")
	public String deleteMarch(@RequestParam(value = "num") Long num, Model model) {
		model.addAttribute("num", num);
		metier.suprimerMarchandise(num);
		model.addAttribute("marchandises", metier.getMarchandiseParMc(""));
		//model.addAttribute("cargaisons", metier.getAllCargaison());
		return "Transport";
	}
}
