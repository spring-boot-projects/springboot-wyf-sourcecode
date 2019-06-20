package com.wisely.highlight_spring4.ch3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@Configuration和@ComponentScan注解到@WiselyConfiguration上，构成组合注解，使之具备元注解的功能
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //1 组合@Configuration元注解
@ComponentScan //2 组合@ComponentScan元注解
public @interface WiselyConfiguration {
	
	String[] value() default {}; //3 覆盖@Configuration和@ComponentScan元注解中的value参数

}
