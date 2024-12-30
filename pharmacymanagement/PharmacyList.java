package pharmacymanagement;
import java.util.ArrayList;
public class PharmacyList {
	ArrayList<Pharmacist>pharmacistList=new ArrayList<>();
	
	public PharmacyList() {
        
    }
	
	public void addPharmacist(Pharmacist a) {
        pharmacistList.add(a);
    }
	
	public void viewPharmacistInformation() {
        for (Pharmacist a : pharmacistList) {
            System.out.println(a);
        }
    }

	public void deletePharmacist(int id) {
	    for (Pharmacist p : pharmacistList) {
	        if (p.getpId() == id) {
	        	pharmacistList.remove(p);
	        	break;
	        }
	    }
	}
	
	

}
