/**
 * Weidai
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
package com.wdai.netty.server.aio;

/**
 * @author reus
 * @version $Id: TimeServer.java, v 0.1 2017-07-18 reus Exp $
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        new Thread(new AsyncTimeServerHandler(port), "AIO-AsyncTimeServerHandler-001").start();
    }
}