package pharmacymanagement;

public class Pharmacist {
	private int pId;
	private String pName;
	private String contactInfo;
	
	public Pharmacist(int pId, String pName, String contactInfo) {
        this.pId = pId;
        this.pName = pName;
        this.contactInfo = contactInfo;
    }
	
	public int getpId() {
        return pId;
    }
	
	public String toString() {
        return "pharmacist [id=" + pId + ", name=" + pName + ", contactInfo=" + contactInfo + "]";
    }
}
