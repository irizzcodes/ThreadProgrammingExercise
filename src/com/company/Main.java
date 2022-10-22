package com.company;

import java.util.ArrayList;


public class Main extends  Thread {
    Counter counter = new Counter();
    Printer printer = new Printer();

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Wait while thread is running");
        while(thread.isAlive()){
        }
        System.out.println("Finish");
    }

    public void run(){
        counter.doCount();
        printer.doPrint();
    }
}

class Storage {
    protected static ArrayList<Integer> list = new ArrayList<Integer>();

    void doStore(int integer){
     list.add(integer);
 }
}

class Counter {
    Storage storage = new Storage();


     void doCount(){
        for (int x = 0; x<11;x++){
            storage.doStore(x);
        }
    }
}

class Printer {
     void doPrint(){
         for(int i = 0;i < Storage.list.toArray().length;i++)
        System.out.println(Storage.list.get(i));
    }
}