package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async //1 通过@Async注解声明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor.
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
        if (i == 3) {
            throw new RuntimeException("runtime exception");
        }
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i + 1));
    }

}
