package identity;

public abstract class Admin {
	private String adminName="admin";
    private String password="admin1234";
    
    public Admin () {
    	
    }
    public Admin(String adminName, String password) {
    	this.adminName=adminName;
    	this.password=password;
    }

   public String login(String a,String b){
	   if (adminName.equals(a) && password.equals(b))
           return "connected";
       else
           return "verify your name or password";
   }

   public  String getAdminName() {
       return adminName;
   }
   
   public String getPassword() {
       return password;
   }

   public abstract void addPharmacist();
   public abstract void addMedicinStock();
   public abstract void viewPharmacistInformation();
   public abstract void viewMedicin();
   public abstract void viewbooked();
   public abstract void deletebooked();
   public abstract void deletePharmacist();
   public abstract void deleteMedicin();  
   public abstract void deleteMedicinStock();

}
