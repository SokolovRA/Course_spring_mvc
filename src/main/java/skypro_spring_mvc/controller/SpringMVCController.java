package skypro_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/skypro")
public class SpringMVCController {

    @RequestMapping("/enterInfo")
    public String enterCountry() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("nameCountry") String country,
                           @RequestParam("nameCapital") String capital,
                           Model model) {
        model.addAttribute("newCountry", country);
        model.addAttribute("newCapital", capital);
        return "showInfo";
    }
}

