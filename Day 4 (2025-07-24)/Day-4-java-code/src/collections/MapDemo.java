package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> airportCode = new TreeMap<>();
		airportCode.put("CCU","Kolkata");
		airportCode.put("BOM","Mumbai");
		airportCode.put("MAA","Chennai");
		airportCode.put("DEL","Delhi");
		
//		System.out.println(airportCode.get("BOM"));
//		System.out.println(airportCode.containsKey("BOM1"));
		for(Map.Entry<String,String> data:airportCode.entrySet()) {
			System.out.println(data.getKey()+"-"+data.getValue());
		}

	}

}
