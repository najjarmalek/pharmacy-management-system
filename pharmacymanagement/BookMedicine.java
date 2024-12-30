
package pharmacymanagement;
import java.util.ArrayList;
public class BookMedicine {
	 ArrayList<Medicin>bookedMedicine=new ArrayList<>();
	
	
	public BookMedicine() {
        
    }

    public void viewBookedMedicin(){
        for(Medicin b:bookedMedicine){
 
                System.out.println(b);
            }

    }

    public void modifyBookedMedicin(int id,int quantity){
    	for (Medicin b : bookedMedicine) {
            if (b.getId() == id) {
                b.setQuantityStock(quantity);
            }
        }
        
    }  
    public void deletebooked(){
        bookedMedicine.clear();
    }

    public void deleteMedicin(int id){
        for(Medicin b:bookedMedicine){
            if(b.getId()==id){
                bookedMedicine.remove(b);
            }
        }
    }
	
}
