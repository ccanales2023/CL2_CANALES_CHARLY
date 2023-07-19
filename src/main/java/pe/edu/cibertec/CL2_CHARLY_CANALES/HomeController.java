package pe.edu.cibertec.CL2_CHARLY_CANALES;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

 // @RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("year", 2023);
        return "home";
    }
    
    @GetMapping("/nosotros")
    public String about() {
        return "about";
    }
   

   

}
    

