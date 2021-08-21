
public class Product {
	//cstor blogu
	public Product(int id, String name, String description, double price) {
		System.out.println("Cstor calisti");
	}
	public Product() {
		System.out.println("parametresiz cstor calisti");
	}
	// attribute | field // yni ozellik classý
	private int id; // private sadece tanýmladýðý bloðun icinde kullanýlabilir
	private String name;
	private String description;
	private double price;
	private int stockAmount;


	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setPrice(double price) {
		this.price = price; // this bu classtaki demektri!!!!!!!!
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return name.substring(0,2) +"_"+ id;
	}
}
