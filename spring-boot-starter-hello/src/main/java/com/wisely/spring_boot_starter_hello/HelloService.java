package com.wisely.spring_boot_starter_hello;

/**
 * 项目名称：acm-bridge-server
 * 类名称：HelloService
 * 类描述：
 * @author liubo
 * 创建时间：2019/6/23 17:26
 */
public class HelloService {

    private String msg;

    /**
     * 打招呼方法
     */
    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
