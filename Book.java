package test.nodto;

public class Book {
	private String id;
	private String name;
	
	public Book(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Media with(Media media) {
		return media.with(id, name).with("salary", "2000");
	}
}
