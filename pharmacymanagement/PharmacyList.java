package pharmacymanagement;
import java.util.ArrayList;
public class PharmacyList {
	ArrayList<Pharmacist>pharmacistList=new ArrayList<>();
	
	public PharmacyList(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = pharmacistList;
    }
	
	public void addPharmacist(Pharmacist a) {
        pharmacistList.add(a);
    }
	
	public void viewPharmacistInformation() {
        for (Pharmacist a : pharmacistList) {
            System.out.println(a);
        }
    }

	public void deletePharmacist(int a) {
	    for (Pharmacist p : pharmacistList) {
	        if (p.getpId() == a) {
	        	pharmacistList.remove(a);
	        	break;
	        }
	    }
	}
	
	

}
