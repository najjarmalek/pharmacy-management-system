package pharmacymanagement;
import identity.User;
import identity.Admin;
import java.util.Scanner;
import java.util.ArrayList;
public class Tst {
	
	public static void main(String[] args) {
		Scanner var =new Scanner(System.in);
		ArrayList<Pharmacist>pharmacists=new ArrayList<>();
		PharmacyList pL = new PharmacyList(pharmacists);
		ArrayList<Medicin>medicins=new ArrayList<>();
		MedicinList mL=new MedicinList(medicins);
        System.out.println("############# Welcome to the Pharmacy Management System #############");
        Admin admin = new Admin() {
        	@Override
            public void addPharmacist() {
        		System.out.println("donner id : ");
        		int id = var.nextInt();
        		System.out.println("donner nom : ");
        		String nom=var.nextLine();
        		System.out.println("donner contact : ");
        		String info = var.nextLine();
        		Pharmacist p = new Pharmacist(id,nom,info);
        		pL.addPharmacist(p);
        		System.out.println("Pharmacien ajouté avec succès : "+p);
        		
        	}
        	
        	@Override
        	public void addMedicinStock() {
        		System.out.println("Veuiller entrer l'ID du medicament :");
        		int id = var.nextInt();
        		System.out.println("Veuillez entrer le nom de medicament :");
        		String nom = var.nextLine();
        		System.out.println("Veuillez entrer le qauntite du stock: ");
        		int quantity=var.nextInt();
        		System.out.println("Veuillez entrer le prix: ");
        		double prix=var.nextDouble();
        		Medicin m = new Medicin(id,nom,quantity,prix);
        		mL.addMedicinStock(m, quantity); 
        		System.out.println("Medicament ajouté avec succes: "+m);        	}
        	
        	@Override
        	public void viewPharmacistInformation() {
        		System.out.println("Les informations de pharmaciens: ");
        		pL.viewPharmacistInformation();
        	}
        	
        	@Override
        	public void viewMedicin() {
        		System.out.println("Les medicaments diponibles: ");
        		mL.viewMedicin();
        	}
        	
        	@Override
        	public void viewBookedMedicin() {
        		
        	}
        	
        	@Override
        	public void modifyBookedMedicin() {}
        	
        	@Override
        	public void deletePharmacist() {
        		System.out.println("Donner l'Id de pharmacien a supprimer: ");
        		int id=var.nextInt();
        		pL.deletePharmacist(id);
        	}
        	
        	@Override
        	public void deleteMedicin() {}
        	
        	@Override
        	public void deleteBookedMedicine() {}
        	
        	@Override
        	public void deleteMedicinStock() {}
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String username = sc.nextLine();
        System.out.println("Password:");
        String password = sc.nextLine();
        System.out.println(admin.login(username, password));
        admin.addMedicinStock();
	
	
	}

}
