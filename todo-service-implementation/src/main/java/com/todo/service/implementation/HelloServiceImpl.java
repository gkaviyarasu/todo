package com.todo.service.implementation;

import com.todo.service.HelloService;
import com.todo.service.datacontract.SampleObj;

/**
 * Created by kaviyarasug on 30/03/15.
 */
public class HelloServiceImpl implements HelloService {
    public SampleObj sayHello() {
        return new SampleObj();
    }
}
