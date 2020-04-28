package com.averyday.demo.controller;

import java.lang.annotation.*;

/**
 * Description
 * Author ayt  on
 */
@Inherited
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RateLimitAspect {
}
