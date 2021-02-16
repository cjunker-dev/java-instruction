package ch07_ClassDemos;

public class Vendor {
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	
	
	
	public Vendor() {
		super();
		this.code = "";
		this.name = "";
	}



	public Vendor(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}



	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Vendor [code=" + code + ", name=" + name + "]";
	}
	
	
	
}
