package com.example.webs.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class MainController {
    @GetMapping(path = "/")
    public ModelAndView MainScreen()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }
    @GetMapping("/home")
    public ModelAndView homescreen(Model model)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        model.addAttribute("Username", UserController.mainUser.getusername());
        return modelAndView;
    }
}
