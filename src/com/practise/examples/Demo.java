/*
 * package com.practise.examples;
 * 
 * import java.util.Collections;
 * 
 * public class Demo { public static void main(String[] args) throws
 * InterruptedException {
 * 
 * Counter c = new Counter();
 * 
 * Collectio Runnable obj1 = new Runnable() {
 * 
 * public void run() { for (int i = 1; i <= 10000; i++) { c.increment(); } } };
 * 
 * Runnable obj2 = () -> { // for(int i=1;i<=1000;i++) for (int i = 1; i <=
 * 10000; i++) { c.increment(); } };
 * 
 * Thread t1 = new Thread(obj1); Thread t2 = new Thread(obj2);
 * 
 * t1.start(); t2.start();
 * 
 * t1.join(); t2.join();
 * 
 * System.out.println(c.count); } }
 * 
 * class Counter { int count;
 * 
 * // public void increment() public synchronized void increment() { count++; }
 * }
 */