package test.nodto;

public class JsonMedia implements Media{
	final Page page;
	
	JsonMedia(Page page){
		this.page = page;
	}
	
	@Override
	public Media with(String id, String value) {
		return new JsonMedia(this.page.with(id, value));
	}
	
	@Override
	public String json() {
		return this.page.json();
	}
}
