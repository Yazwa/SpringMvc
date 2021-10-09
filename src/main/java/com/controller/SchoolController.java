package main.java.com.controller;

import com.model.School;
import com.model.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SchoolController {

    @RequestMapping("/school")
    public String showSchoolForm() {
        System.out.println("Coming showForm ");
        return "school";
    }

    @RequestMapping(value = "/processSchoolForm", method = RequestMethod.POST)
    public String processSchoolForm(@ModelAttribute School school, Model model) {
        SchoolRepository schoolRepository = new SchoolRepository();
        schoolRepository.add(school);
        System.out.println(school);
        return "schoolSuccess";
    }

    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("Header" , "This is the school registration page");
    }

}
