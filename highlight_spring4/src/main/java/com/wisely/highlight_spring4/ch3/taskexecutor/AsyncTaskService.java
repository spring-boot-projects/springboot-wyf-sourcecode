package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async //1 ͨ��@Asyncע�������÷����Ǹ��첽���������ע�����༶��������������еķ��������첽������������ķ����Զ���ע��ʹ��ThreadPoolTaskExecutor��ΪTaskExecutor.
    public void executeAsyncTask(Integer i) {
        System.out.println("ִ���첽����: " + i);
        if (i == 3) {
            throw new RuntimeException("runtime exception");
        }
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("ִ���첽����+1: " + (i + 1));
    }

}
