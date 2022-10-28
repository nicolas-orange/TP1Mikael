package fr.imt.TP1Mikael;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebAnnuaire {

	@GetMapping("/annuaire/recherche")
	public String recherche(Model model,@RequestParam (name = "name", required = false, defaultValue = "*") String name) {
//		if (name.equals("*"))
//			model.addAttribute("entries",  ds.getAll());
//		else
//			model.addAttribute("entries", ds.getFromName(name));
		return "annuaire/recherche";
	}

}
