package test.nodto;

import java.util.ArrayList;


public class JsonPage implements Page{
	final ArrayList<String> list;
	public JsonPage(ArrayList<String> a) {
		this.list = a;
	}
	@Override
	public String json() {
		String str = "";
		for (String string : list) {
			str += string;
		}
		System.out.println(str);
		return str;
	}
	
	public Page with(String name) {
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
