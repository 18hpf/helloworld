package com.classbook.chapter.work;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        try {
            string = scanner.nextLine();
            if (string.length() > 20) {
                throw new StringTooLongException();
            }
            System.out.println("该字符串没超过20个字符");
        } catch (StringTooLongException e) {
            e.PrintfException();
        }
    }
}
class StringTooLongException extends Exception{
    public void PrintfException(){
        System.out.println("字符串长度超过20，抛出异常");
    }
}