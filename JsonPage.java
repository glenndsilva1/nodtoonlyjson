package test.nodto;

import java.util.HashMap;
import java.util.Map;

public class JsonPage implements Page{
	final HashMap<String, String> map;
	public JsonPage(HashMap<String, String> map) {
		this.map = map;
	}
	@Override
	public String json() {
		String str = "";
		for (Map.Entry<String, String> entry : map.entrySet()) {
		   str += " Key: " + entry.getKey() + ", Value: " + entry.getValue();
		}
		return str;
	}
	
	public Page with(String id, String name) {
		HashMap<String, String> a = new HashMap<String, String>();
		a.putAll(this.map);
		a.put(id, name);
		return new JsonPage(a);
	}
	
	public static void main(String args[]) {
		// 	Empty map
		JsonPage jpage = new JsonPage(new HashMap<String, String>());
		Media media = new JsonMedia(jpage);
		Book book = new Book("1","Glenn");
		System.out.println(book.with(media).json());
	}
}
