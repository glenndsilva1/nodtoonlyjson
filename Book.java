package test.nodto;

import java.util.ArrayList;

public class Book {
	private String id;
	private String name;
	
	
	public Book(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Media with(Media media) {
		
	return media.with(new JsonStr(id, name).jsonstr())
			 	.with(new JsonStr("key","value").jsonstr())
			 	.with(new JsonArray("key", new ArrayList<String>()).jsonarray());
	}
}
