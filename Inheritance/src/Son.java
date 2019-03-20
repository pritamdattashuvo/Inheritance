
public class Son extends Parent {
	
	public Son(String name, String skinColor, String height) {
		super(name, skinColor, height);
		// TODO Auto-generated constructor stub
	}

	String language="English";

	@Override
	public void details() {
		System.out.println("The Details = "+name+"\n "+"skinColor: "+skinColor+"\n "+"height: "+height+"\nLanguage: "+language);
	}

}
