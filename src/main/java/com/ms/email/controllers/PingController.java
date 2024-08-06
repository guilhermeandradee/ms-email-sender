package com.ms.email.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("ping")
public class PingController {
    @RequestMapping(value = "/ping", method = RequestMethod.HEAD)
    public void getPing(){}
}
