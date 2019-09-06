package com.example.sbdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        return "Hello ksb branch" + InetAddress.getLocalHost().getHostName();
    }
}
