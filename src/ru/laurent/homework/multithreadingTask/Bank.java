package ru.laurent.homework.multithreadingTask;

public class Bank {

    public void transferMoney(Account src, Account dst, int money){
        Thread transaction = new Thread(new Transaction(src, dst, money));
        transaction.start();
    }
}
