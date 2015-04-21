package com.example.util;

import java.util.*;

public class Logger {
    public static void log(String message, Class clazz) {
        Date now = new Date();

        StringBuilder builder = new StringBuilder();

        builder.append(now.toString());
        builder.append(" ");
        builder.append(clazz.getName());
        builder.append(" ");
        builder.append(System.lineSeparator());

        builder.append("FATAL: ");
        builder.append(message);

        System.out.println(builder);

    }
}

