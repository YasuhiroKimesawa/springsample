package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController
{


    @RequestMapping(method = RequestMethod.GET)
    public String newName( Model model )
    {
        User user = new User();
        model.addAttribute( "user", user );
        return "newname";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String idCheck( Model model, User user )
    {
        model.addAttribute( "user", user );
        return "newname";
    }
}