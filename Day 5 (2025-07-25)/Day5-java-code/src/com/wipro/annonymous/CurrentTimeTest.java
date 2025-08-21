package com.wipro.annonymous;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class CurrentTimeTest {

	public static void main(String[] args) {
		Consumer<ZoneId> printCurrentTime = zone->{
			ZonedDateTime currentTime=ZonedDateTime.now(zone);
			System.out.println("Current time in " + zone+" : " + currentTime);
		};
		printCurrentTime.accept(ZoneId.of("Europe/London"));

	}

}
