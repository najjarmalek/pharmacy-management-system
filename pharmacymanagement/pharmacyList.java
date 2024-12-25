import java.util.ArrayList;
import identity.*;

public class pharmacyList {
     ArrayList<pharmacist>pharmacistList=new ArrayList<>();
    
        public pharmacyList(ArrayList<pharmacist> pharmacistList) {
            this.pharmacistList = pharmacistList;
        }
    
    
        public void addPharmacist(pharmacist a){
            pharmacistList.add(a);
        }
    
        public void viewPharmacistInformation(){
            for(pharmacist a:pharmacistList){
                System.out.println(a);
            }
        }
    
        public void deletePharmacist(String a){
            for(pharmacist b:pharmacistList){
            if(b.getId()==a){
                pharmacistList.remove(b);
            }
        }
    }





}
