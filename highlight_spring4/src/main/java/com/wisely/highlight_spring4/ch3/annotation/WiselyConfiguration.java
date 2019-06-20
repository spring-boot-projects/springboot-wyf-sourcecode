package com.wisely.highlight_spring4.ch3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ʹ��@Configuration��@ComponentScanע�⵽@WiselyConfiguration�ϣ��������ע�⣬ʹ֮�߱�Ԫע��Ĺ���
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //1 ���@ConfigurationԪע��
@ComponentScan //2 ���@ComponentScanԪע��
public @interface WiselyConfiguration {
	
	String[] value() default {}; //3 ����@Configuration��@ComponentScanԪע���е�value����

}
