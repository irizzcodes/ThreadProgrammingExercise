package com.company;

import java.util.ArrayList;

public class Main extends  Thread {
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }


    }

    public void run(){

    }
}

class Storage {
 private void doStore(int integer){



 }
}

class Counter {

}
class Printer {

}