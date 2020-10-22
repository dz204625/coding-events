package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("eventcategories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping("")
        public String displayAllEvent(Model model){
        model.addAttribute("eventCategories", eventCategoryRepository.findAll());
        eventCategoryRepository.findAll();

        return "eventscategories/index";
        }

    @GetMapping("create")
    public String renderCreateEventCategoryForm (){
        return "eventscategories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(){


        return "eventscategories/create";
    }



}
