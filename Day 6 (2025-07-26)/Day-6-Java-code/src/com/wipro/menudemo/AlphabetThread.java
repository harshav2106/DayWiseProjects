package com.wipro.menudemo;

public class AlphabetThread extends Thread {
	public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println("Alphabet: " + c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
