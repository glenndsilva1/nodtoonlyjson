package test.nodto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonPage implements Page{
	final ArrayList<String> list;
	public JsonPage(ArrayList<String> a) {
		this.list = a;
	}
	@Override
	public String json() {
		String str = "";
//		for (Map.Entry<String, String> entry : map.entrySet()) {
//		   str += " Key: " + entry.getKey() + ", Value: " + entry.getValue();
//		}
		return str;
	}
	
	public Page with(String name) {
		//HashMap<String, String> a = new HashMap<String, String>();
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(this.list);
		a.add(name);
		return new JsonPage(a);
	}
	
	public static void main(String args[]) {
		// 	Empty map
		JsonPage jpage = new JsonPage(new ArrayList<String>());
		Media media = new JsonMedia(jpage);
		Book book = new Book("1","Glenn");
		System.out.println(book.with(media).json());
	}
}
