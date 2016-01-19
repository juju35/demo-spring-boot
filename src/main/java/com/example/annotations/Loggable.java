package com.example.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by julien on 19/01/2016.
 */
@Retention(RUNTIME)
@Target(FIELD)
@Documented
public @interface Loggable {
}
