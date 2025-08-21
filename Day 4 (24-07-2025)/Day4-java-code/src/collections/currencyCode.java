package collections;

import java.util.Map;
import java.util.TreeMap;

public class currencyCode {

	public static void main(String[] args) {
		Map<String,String> curCode = new TreeMap<>();
		curCode.put("USD","United States Dollar");
		curCode.put("INR","Indian Rupee");
		for(Map.Entry<String,String> data:curCode.entrySet()) {
			System.out.println(data.getKey()+"-"+data.getValue());
		}

	}

}
