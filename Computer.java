package abstractClassPractice;

public class Computer extends TangibleAsset {
	// private String name;
	// private int price;
	// private String color;
	private String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		// TangibleAsset(name, price, color);
		// this.name = name;
		// this.price = price;
		// this.color = color;
		this.makerName = makerName;
	}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	public String getColor() {return color;}
	public String getMakerName() {return makerName;}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setWeight(double weight) {
		// TODO Auto-generated method stub
		return 0;
	}

}
