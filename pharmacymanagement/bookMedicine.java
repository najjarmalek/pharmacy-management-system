import java.util.ArrayList;

public class bookMedicine {
    ArrayList<medicin>bookedMedicine=new ArrayList<>();




    public bookMedicine(ArrayList<medicin> bookedMedicine) {
        this.bookedMedicine = bookedMedicine;
    }
    
    public void viewbookedMedicine(){
        for(medicin b:bookedMedicine){
            
                System.out.println(b);
            }
        
    }

    public void modifyBookMedicin(medicin a,int quantity){
        if(bookedMedicine.contains(a)){
            for(medicin b:bookedMedicine){
                if(b.getId()==a.getId()){
                    b.setQuantityStock(quantity);
                }
            }
        }
        else{
            bookedMedicine.add(a);
        }
    }  

    public void deleteMedicin(medicin a){
        for(medicin b:bookedMedicine){
            if(b.getId()==a.getId()){
                bookedMedicine.remove(b);
            }
        }
    }


}
    