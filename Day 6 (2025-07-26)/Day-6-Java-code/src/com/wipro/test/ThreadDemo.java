package com.wipro.test;

import com.wipro.menudemo.AlphabetThread;
import com.wipro.menudemo.NumberThread;

public class ThreadDemo {

		public static void main(String[] args) {
	        NumberThread numThread = new NumberThread();
	        numThread.start();
	        AlphabetThread alphaThread = new AlphabetThread();
	        alphaThread.start();

	}

}
