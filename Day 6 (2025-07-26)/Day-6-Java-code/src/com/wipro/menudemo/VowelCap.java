package com.wipro.menudemo;

import java.util.List;

public class VowelCap implements Runnable {
	List<String> names;
	public VowelCap(List<String>names) {
		this.names=names;
	}

	@Override
	public void run() {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            char first = Character.toUpperCase(name.charAt(0));
            if (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
                names.set(i, name.toUpperCase());
            }
        }
    }
}

