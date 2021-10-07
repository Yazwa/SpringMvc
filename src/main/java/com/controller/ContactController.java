package main.java.com.controller;

import main.java.com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String showForm() {
        return "contact";
    }

    //@ModelAttribute will fetch the data from form , binds it to user object and adds the user object to model so that we can fetch this user object in success.jsp
    // the instance variables in User class should have same names as the names in form so that binding happens correctly
    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model) {
        return "success";
    }


    //basically what this function does is
    //1. @RequestMapping maps the form action to this method
    //2. @RequestParam fetches the particular param from post or get attribute of the form nd assigns it to corresponding attribute
    //3. Now we can add each astribute seperately in model (like the code which is single line commented) OR We can create user object and assign the values of form to user object and add user object to model
    //4. But all of these things are done by @ModelAttribute which is implemented in above  method
    /*@RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(@RequestParam(value = "email", required = false) String email, @RequestParam("userName") String userName, @RequestParam(value = "userPassword", required = true) String userPassword, Model model) {

        System.out.println("Name is" + userName);

        User user = new User();
        user.setEmail(email);
        user.setUserName(userName);
        user.setUserPassword(userPassword);

        model.addAttribute("user", user);

        //model.addAttribute("email", email);
        //model.addAttribute("userName", userName);
        //model.addAttribute("userPassword", userPassword);

        return "success";

    }*/

    //One more use of @ModelAttribute is that when we mention @ModelAttribute before method like below , then this fnc will be called before the handler function
    //i.e for example if request comes for /contact (whose handler is showForm()) then commonDataForModel() will be called and then showForm() will be called
    //Basically when we want to send common attributes to view for all the controller methods then we can use this
    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("Header" , "This is the registration page");
    }
}
