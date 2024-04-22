package test.nodto;

public interface Page {
	String json();
	Page with(String id, String value);
}
