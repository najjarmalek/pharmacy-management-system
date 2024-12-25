public class medicin extends pharmacist {
    private int id;
    private String name;
    private int quantityStock;
    private double price;


    
    public medicin(int id1,String name ,String contactInfo,int id2, String name2, int quantityStock, double price) {
        super(id1, name, contactInfo);
        this.id = id2;
        this.name = name2;
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
