package main.java.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class Scontroller {

    // We can use @RequestMapping annotation for either class or method , if it is used for class then inorder to call method we need call using /first/urlOfMethod

    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public String helloEx(Model model) {
        System.out.println("Coming here");
        model.addAttribute("name" , "Sathwik");

        //view name shoulkd be returned
        return "hello";
    }

    @RequestMapping("/about")
    public String about() {
        //In order to call this method u need to use /first/about as first is used in RequestMapping of controller
        return "about";
    }

    @RequestMapping("/age")
    public ModelAndView age() {
        ModelAndView modelAndView = new ModelAndView();
        //setting the view name (earlier in Model we used to return String as view name)
        modelAndView.setViewName("age");

        //setting the data
        modelAndView.addObject("age", 24);

        return modelAndView;
    }
}
