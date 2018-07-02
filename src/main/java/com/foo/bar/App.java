package com.foo.bar;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");
        if(StringUtils.contains("foo","foobar")) {
            System.out.println("maven is magic");
        }
        System.out.println("maven is sorcery");
    }
}
