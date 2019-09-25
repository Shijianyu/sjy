package com.cnpc.epai.productionmanager.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo/test")
@CrossOrigin(origins = "*")
public class HelloController {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hello() {
        return "hello world!";
    }
    
    @RequestMapping(value = "/{menuId}", method = RequestMethod.GET)
    public String menu(@PathVariable String menuId) {
        return "hello world!"+menuId;
    }

}
