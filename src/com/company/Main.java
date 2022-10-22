package com.company;

import java.util.ArrayList;


public class Main extends  Thread {
    Counter counter = new Counter();
    Printer printer = new Printer();

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Finish");


    }

    public void run(){
        counter.doCount();
        printer.doPrint();


    }
}

class Storage {
     static ArrayList<Integer> list = new ArrayList<Integer>();

 static void doStore(int integer){
     list.add(integer);

 }
}

class Counter {


     void doCount(){
        for (int x = 0; x<11;x++){
            Storage.doStore(x);

        }
    }

}
class Printer {
     void doPrint(){
        System.out.println(Storage.list);

    }


}