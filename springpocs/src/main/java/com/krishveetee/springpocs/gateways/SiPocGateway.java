package com.krishveetee.springpocs.gateways;

import java.util.concurrent.Future;

import org.springframework.integration.annotation.Gateway;

public interface SiPocGateway {
    @Gateway(requestChannel = "say.hello.channel")
    void sayHello(String name);

    @Gateway(requestChannel = "get.hello.channel")
    String getHelloMessage(String name);

    @Gateway(requestChannel = "get.hello.channel")
    Future<String> getHelloMessageAsync(String name);

}
