package com.mycompany.intro.to.java;
public class IntroToJava {
    public static void main(String[] args) {
        String greeting = "Hello Good Day";
        System.out.println(greeting);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("G"));
        System.out.println(greeting +  ", " + txt);
        System.out.println(greeting.concat(txt));
        System.out.println("I love programming and \n to all tech subjects");
    }
}
