package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("/contact")
    public String showForm() {
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String email,
                              @RequestParam("username") String username,
                              @RequestParam("password") String password) {

        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);

        return "formsuccess";
    }
}