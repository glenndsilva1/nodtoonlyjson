package test.nodto;

public class JsonStr {
	private String key;
	private String value;
	
	public JsonStr(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String jsonstr() {
		return this.key + ":" + this.value;
	}
}
