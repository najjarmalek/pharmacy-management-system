package pharmacymanagement;
import java.util.ArrayList;
public class MedicinList {
	private ArrayList<Medicin>mL=new ArrayList<>();

	public MedicinList(ArrayList<Medicin> medicinList) {
		
		this.mL = medicinList;
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
	
	public void deleteMedicinStock(){
        for(Medicin b:mL){
            if(b.getQuantityStock()==0){
                mL.remove(b);
            }
        }
    }
	 
}
