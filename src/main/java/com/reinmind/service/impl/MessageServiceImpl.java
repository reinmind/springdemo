package com.reinmind.service.impl;

import com.reinmind.service.MessageService;

public class MessageServiceImpl implements MessageService {
    @Override
    public void send(String target, String msg) {
        System.out.println("send to target:" + target + " with message " + msg);
    }
}
