
public class Parent {
	public String name,skinColor,height;
	
	
	
	public Parent(String name, String skinColor, String height) {
		
		this.name = name;
		this.skinColor = skinColor;
		this.height = height;
	}



	public void details() {
		name = "John";
		skinColor = "white";
		height="6";
		
		System.out.println("The Details = "+name+"\n "+"skinColor: "+skinColor+"\n "+"height: "+height);
	}
	
	
}
