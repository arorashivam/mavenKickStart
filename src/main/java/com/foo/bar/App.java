package com.foo.bar;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        if(StringUtils.contains("foobar", "foo")) {
            System.out.println("what sorcery is it.");
        }
    }
}
