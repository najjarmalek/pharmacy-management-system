package pharmacymanagement;
import java.util.ArrayList;
public class MedicinList {
	 ArrayList<Medicin>mL=new ArrayList<>();

	public MedicinList() {
		
		
	    }
	
	public void addMedicinStock(Medicin m1 , int quantity) {
		for (Medicin m2 : mL) {
			if(m2.getId()==m1.getId()) {
				m2.setQuantityStock(m2.getQuantityStock()+quantity);
			}
		}
		mL.add(m1);
	}
	
	public void viewMedicin() {
        for (Medicin m : mL) {
            System.out.println(m);
        }
    }
	
	public void deleteMedicinStock(int a){
        for(Medicin b:mL){
            if(b.getId()==a){
                mL.remove(b);
            }
        }
    }
	 
}
