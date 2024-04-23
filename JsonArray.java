package test.nodto;

import java.util.ArrayList;
import java.util.function.Function;

public class JsonArray {
	private final String key;
	Function<ArrayList<String>, String> listToString = numlist -> {
		String str = "";
		for(String string : numlist){
			str += string;
		}
		return str;
	};
	
	ArrayList<String> arr;
	
	public JsonArray(String key, ArrayList<String> arr) {
		this.key = key;
		this.arr = arr;
	}
	
	public String jsonarray() {
		return this.key + ":"+this.listToString.apply(this.arr);
	}
}
