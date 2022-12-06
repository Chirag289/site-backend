package com.example.demo.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class FooController {

//    @Autowired
//    private IFooService service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Hello";
    }

}
