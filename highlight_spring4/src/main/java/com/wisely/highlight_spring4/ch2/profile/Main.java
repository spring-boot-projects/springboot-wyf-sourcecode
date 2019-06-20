package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context =  
				  new AnnotationConfigApplicationContext();
		  
		  context.getEnvironment().setActiveProfiles("dev"); //1 获取环境上下文，设置激活的profile为dev
		  context.register(ProfileConfig.class);//2 后置注册Bean配置类，不然会报Bean未定义错误
		  context.refresh(); //3 刷新容器
		  
	      DemoBean demoBean = context.getBean(DemoBean.class);
	      
	      System.out.println(demoBean.getContent());
	      
	      context.close();
	}
}
