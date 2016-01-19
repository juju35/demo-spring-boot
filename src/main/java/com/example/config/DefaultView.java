package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by julien on 19/01/2016.
 */
@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        //registry.addViewController( "/" ).setViewName( "redirect:/swagger-ui.html" );
        registry.addViewController( "/swagger" ).setViewName( "redirect:/swagger-ui.html" );
        registry.addViewController( "/admin" ).setViewName( "redirect:/admin/index.html" );
        registry.addViewController("/actuator").setViewName("redirect:/admin/docs/");

        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }
}