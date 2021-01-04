package com.reinmind.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author xiang.zhang
 */
@Data
public class Message {
    Integer id;
    Integer target;
    String message;
    Date date;
}
