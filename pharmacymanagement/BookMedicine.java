
package pharmacymanagement;
import java.util.ArrayList;
public class BookMedicine {
	private ArrayList<Medicin>bookedMedicine=new ArrayList<>();
	
	
	public BookMedicine(ArrayList<Medicin> bookedMedicine) {
        this.bookedMedicine = bookedMedicine;
    }

    public void viewBookedMedicin(){
        for(Medicin b:bookedMedicine){

                System.out.println(b);
            }

    }

    public void modifyBookedMedicin(Medicin a,int quantity){
    	for (Medicin b : bookedMedicine) {
            if (b.getId() == a.getId()) {
                b.setQuantityStock(quantity);
            }
        }
        bookedMedicine.add(a);
    }  

    public void deleteMedicin(Medicin a){
        for(Medicin b:bookedMedicine){
            if(b.getId()==a.getId()){
                bookedMedicine.remove(b);
            }
        }
    }
	
}
