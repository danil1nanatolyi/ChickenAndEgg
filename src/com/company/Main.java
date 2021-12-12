package com.company;

public class Main {

    public static void main(String[] args) {
        Thread egg = new Egg();
        Thread Chicken = new Chicken();
        egg.start();
        Chicken.start();
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (egg.isAlive() == true){
            try {
                egg.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Спор окончен! Победитель яйцо!");
        } else {
            System.out.println("Спор окончен! Победитель курица!");
        }
    }
}

class Egg extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                sleep(100);
                System.out.println("Яйцо");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Chicken extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(100);
                System.out.println("Курица");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
