package uk.mixam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/register")
    public String showForm(Model model) {
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact-form";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("contact") Contact contact, BindingResult bindingResult, Model model) {
        System.out.println(contact);
        return bindingResult.hasErrors() ? "contact-form" : "contact-form-success";
    }
}
