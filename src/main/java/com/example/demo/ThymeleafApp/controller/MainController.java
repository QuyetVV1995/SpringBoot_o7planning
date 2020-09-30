package com.example.demo.ThymeleafApp.controller;

import com.example.demo.ThymeleafApp.form.PersonForm;
import com.example.demo.ThymeleafApp.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
   private static List<Person> persons = new ArrayList<Person>();
   static {
       persons.add(new Person("Bill", "Gates"));
       persons.add(new Person("Nguyen", "A"));
   }

   @Value("${welcome.message}")
   private String welcomeMessage;

   @Value("${error.message}")
   private String errorMessage;

    @GetMapping("/Thymeleaf/index")
    public String index(Model model){
        model.addAttribute("message",welcomeMessage);
        // tra ve template index.html
        return "Thymeleaf/index";
    }
    @GetMapping("/Thymeleaf/personList")
    public String personList(Model model){
        // Đưa thông tin vào Model
        model.addAttribute("var_personlist",persons);
        return "Thymeleaf/personList";
    }

    @GetMapping("/Thymeleaf/addPerson")
    public String showAddPersonPage(Model model){
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm",personForm);
        return "Thymeleaf/addPerson";
    }

    @PostMapping("/Thymeleaf/addPerson")
    /*
    @ModelAttribute đánh dấu đối tượng PersonForm được gửi lên bởi Form Request
     */
    public String savePerson(Model model, @ModelAttribute PersonForm personForm){
        String firstName =  personForm.getFirstName();
        String lastName = personForm.getLastName();
        if(firstName != null && firstName.length() > 0 &&
         lastName != null && lastName.length() > 0){
            Person newPerson = new Person(firstName, lastName);
            persons.add(newPerson);
            return "redirect:/Thymeleaf/personList";
        }
        model.addAttribute("errormsg",errorMessage);
        return "Thymeleaf/addPerson";
    }
}
