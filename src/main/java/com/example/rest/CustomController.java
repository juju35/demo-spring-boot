package com.example.rest;

import com.example.annotations.Loggable;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by julien on 19/01/2016.
 */

@RestController
@RequestMapping("/rest")
public class CustomController {

    /**
     * LOGGER.
     */
    @Loggable
    Logger logger;

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        logger.info("Appel méthode custom");
        return "custom";
    }
}