import java.util.ArrayList;
import identity.*;

public class medicinList extends pharmacist  {
    ArrayList<medicin>medicinList=new ArrayList<>();

    public medicinList(String id,String name,String contactInfo, ArrayList<medicin> medicinList) {
        super(id,name,contactInfo);
        this.medicinList = medicinList;
    }

    public void addMedicineStock(medicin a, int quantity){
        if(medicinList.contains(a)){
            for(medicin b:medicinList){
                if(b.getId()==a.getId()){
                    b.setQuantityStock(b.getQuantityStock()+quantity);
                }
            }
        }
        else{
            medicinList.add(a);
        }
    }
    public void viewMedicin(String name){
        for(medicin b:medicinList){
            
                System.out.println(b);
            }
        
    }
    public void deleteMedicinStock(){
        for(medicin b:medicinList){
            if(b.getQuantityStock()==0){
                medicinList.remove(b);
            }
        }
    }

    
    



    
}


