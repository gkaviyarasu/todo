package com.todo.service;

import com.todo.service.datacontract.SampleObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaviyarasug on 30/03/15.
 */
@RestController
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    SampleObj sayHello();
}