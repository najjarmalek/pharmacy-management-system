package identity;

public abstract class admin  {
     private String adminname="admin";
     private String password="admin1234";
    
    public admin() {
    }
        
     

    
    public String login(String a,String b){
        if(adminname==a && password==b)
            return "connected";
        else
            return "verify your name or password";
    }


    public  String getAdminname() {
        return adminname;
    }
    public String getPassword() {
        return password;
    }

    abstract void addPharmacist();
    abstract void addMedicineStock();
    abstract void viewPharmacistInformation();
    abstract void viewMedicin();
    abstract void viewBookMedicin();
    abstract void modifyBookMedicin();
    abstract void deletePharmacist();
    abstract void deleteMedicin();  
    abstract void deleteBookMedicine();
    abstract void deleteMedicinStock();
    
    

    


}
