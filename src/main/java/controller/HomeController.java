package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

//    Controller ---------------- Model
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is home url");
        model.addAttribute("name", "arif_exe_");
        model.addAttribute("email","arifansari10027@outlook.com");
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("This is about url");
        return "about";
    }
//        Controller -------------------- ModelAndView
    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("This is help page");

        // For returning
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name" , "Arifffffffffffff");

        //For page linking
        modelAndView.setViewName("help");

        return modelAndView;
    }
}
