package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by julien on 19/01/2016.
 */

@RestController
public class CustomController {

    @RequestMapping(value = "/rest/custom", method = RequestMethod.POST)
    public String custom() {
        return "custom";
    }
}