package pharmacymanagement;

public class Medicin{
	private int id;
	private String name;
	private int quantityStock;
	private double price;
	
	public Medicin(int id, String name, int quantityStock, double price) {
		this.id = id;
		this.name = name;
		this.quantityStock = quantityStock;
		this.price = price;
	}
	
	public int getId() {
        return id;
    }
	
	public String getName() {
		return name;
	}
	
	public int getQuantityStock() {
        return quantityStock;
    }
	
	public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
	
	public String toString() {
        return "medicin [id=" + id + ", name=" + name + ", quantityStock=" + quantityStock + ", price=" + price + "]";
    }

}
