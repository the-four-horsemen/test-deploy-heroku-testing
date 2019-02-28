package com.codegym.testdeployheroku.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDeployHerokuController {

    private static final Logger log = LoggerFactory.getLogger(TestDeployHerokuController.class);

    @RequestMapping("/")
    public String demo(){
        log.debug("Debug");
        log.error("Error");
        return "wellcome to spring boot!!!!!";
    }
}
