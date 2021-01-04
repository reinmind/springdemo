package com.reinmind.service;

/**
 * 信息服务
 */
public interface MessageService {
    /**
     * 给目标发送信息
     * @param target
     * @param msg
     */
    void send(String target,String msg);
}
