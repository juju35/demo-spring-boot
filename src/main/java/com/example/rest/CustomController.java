package com.example.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by julien on 19/01/2016.
 */

@RestController
@RequestMapping("/rest")
public class CustomController {

    protected final Logger log;

    public CustomController() {
        log = LoggerFactory.getLogger(this.getClass());
    }

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        log.info("Appel méthode custom");
        return "custom";
    }
}