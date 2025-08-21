package com.wipro.annonymous;

import java.time.LocalDate;
import java.util.function.Supplier;

public class TommorowDayTest {

	public static void main(String[] args) {
		Supplier<String> tommorow = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();
		System.out.println(tommorow.get());
		

	}

}
