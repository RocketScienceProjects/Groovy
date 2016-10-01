package ScriptVsClass;

public class FirstJavaClass {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String Success(){
		return "Hello "+ name; 
	}
	
	public static void main(String[] arg) {
		FirstJavaClass fj = new FirstJavaClass();
		fj.setName("Java to Groovy");
		
		System.out.println(fj.Success());
	}
}
