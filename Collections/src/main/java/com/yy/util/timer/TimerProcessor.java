package com.yy.util.timer;

import com.yy.exception.TODOException;

import java.lang.reflect.Method;

public class TimerProcessor {
    public static void main(String[] args) {
        try {
            Class<?> loadClass = TimerProcessor.class
                    .getClassLoader()
                    .loadClass("com.yy.util.timer.TimerTest");
            for (Method method : loadClass.getMethods()
            ) {
                if (method.isAnnotationPresent(Timer.class)) {
                    try {
                        throw new TODOException("注解无法直接记录方法启动结束的时间，需要用代理实现");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
