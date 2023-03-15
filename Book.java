package abstractClassPractice;

class Book extends TangibleAsset {
	private String name;
	private int price;
	private String color;
	private String isbn;
	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	public String getColor() {return color;}
	public String getIsbn() {return isbn;}

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
