package hello;

public class greeting {
	private final long id;
	private final String content;
	
	public greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}
