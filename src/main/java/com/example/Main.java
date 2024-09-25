package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 200;
        //Thread
        MioThread t1 = new MioThread(l);//creazione 
        MioThread t2 = new MioThread(l);
        new Thread(t1).start();//avvio
        new Thread(t2).start();
       
        

        System.out.println("Hello world!");


    }
}