public class pharmacist {
    private int id;
    private String name;
    private String contactInfo;


    public pharmacist(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }


    public int getId() {
        return id;
    }


   
    public String toString() {
        return "pharmacist [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + "]";
    }


    
    
}
