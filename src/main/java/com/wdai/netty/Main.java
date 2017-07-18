/**
 * Weidai
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
package com.wdai.netty;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author reus
 * @version $Id: Main.java, v 0.1 2017-07-18 reus Exp $
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-07-18 00:00:00").getTime());
    }
}