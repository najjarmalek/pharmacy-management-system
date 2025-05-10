package pharmacymanagement;

import identity.Admin;
import identity.User;

import java.util.Scanner;

public class Tst {

	public static void main(String[] args) {
		System.out.println("##################### Welcome to the Pharmacy Management System #############");
		Scanner var = new Scanner(System.in);
		PharmacyList pL = new PharmacyList();
		MedicinList mL = new MedicinList();
		BookMedicine bm = new BookMedicine();
		Medicin m1 = new Medicin(1, "doliprane", 14, 5.5);
		Medicin m2 = new Medicin(2, "hexalaton", 100, 15.0);
		Medicin m3 = new Medicin(3, "cerome", 20, 44.5);
		Medicin m4 = new Medicin(4, "pommade", 200, 14.6);
		mL.addMedicinStock(m1, 14);
		mL.addMedicinStock(m2, 100);
		mL.addMedicinStock(m3, 20);
		mL.addMedicinStock(m4, 200);
		Pharmacist p1 = new Pharmacist(12, "mohamed", "26342378");
		Pharmacist p2 = new Pharmacist(13, "ali", "52343212");
		Pharmacist p3 = new Pharmacist(14, "ahmed", "93342321");
		Pharmacist p4 = new Pharmacist(15, "salah", "24637225");
		pL.addPharmacist(p1);
		pL.addPharmacist(p2);
		pL.addPharmacist(p3);
		pL.addPharmacist(p4);
		bm.addBookedMedicin(m1);
		bm.addBookedMedicin(m4);

		Admin admin = new Admin() {
			@Override
			public void addPharmacist() {
				System.out.print("donner id : ");
				int id = var.nextInt();
				var.nextLine();
				System.out.print("donner nom : ");
				String nom = var.nextLine();
				System.out.print("donner contact : ");
				String info = var.nextLine();
				Pharmacist p = new Pharmacist(id, nom, info);
				pL.addPharmacist(p);
				System.out.println("Pharmacien ajouté avec succès : " + p);

			}

			public void addMedicinStock() {
				System.out.print("Veuiller entrer l'ID du medicament :");
				int id = var.nextInt();
				var.nextLine();
				System.out.print("Veuillez entrer le nom de medicament :");
				String nom = var.nextLine();
				System.out.print("Veuillez entrer le qauntite du stock: ");
				int quantity = var.nextInt();
				var.nextLine();
				System.out.print("Veuillez entrer le prix: ");
				double prix = var.nextDouble();

				Medicin m = new Medicin(id, nom, quantity, prix);
				mL.addMedicinStock(m, quantity);
				System.out.print("Medicament ajouté avec succes ");
			}

			public void viewPharmacistInformation() {
				System.out.println("Les informations de pharmaciens: ");
				pL.viewPharmacistInformation();
			}

			public void viewMedicin() {
				System.out.println("Les medicaments diponibles: ");
				mL.viewMedicin();
			}

			public void viewbooked() {
				System.out.println("Les medicaments reserver: ");
				bm.viewBookedMedicin();
			}

			public void deletebooked() {
				bm.deletebooked();
				System.out.println("La liste des medicaments reserver a ete supprimer");

			}

			public void deletePharmacist() {
				System.out.println("Donner l'Id de pharmacien a supprimer: ");
				int id = var.nextInt();
				pL.deletePharmacist(id);
				System.out.println("Pharmacien supprimer avec succes");
			}

			public void deleteMedicin() {
				System.out.println("Donner l'Id de medicament a supprimer: ");
				int id = var.nextInt();
				mL.deleteMedicin(id);
				System.out.println("Medicament supprimer avec succes");
			}

			public void deleteMedicinStock() {
				System.out.println("Donner l'Id de medicament a supprimer: ");
				int id = var.nextInt();
				System.out.println("Donner quantuté à supprimer: ");
				int q = var.nextInt();
				mL.deleteMedicinStock(id, q);
				System.out.println("Medicament stock supprimer avec succes");
			}

		};

		User user = new User() {
			@Override
			public void viewMedicin() {
				System.out.println("Les medicaments diponibles: ");
				mL.viewMedicin();
			}

			@Override
			public void viewBookedMedicin() {
				System.out.println("Les medicaments reserver: ");
				bm.viewBookedMedicin();
			}

			public void modifyBookedMedicin() {
				System.out.println("Veuillez entrer l'ID du medicament a modifier: ");
				int id = var.nextInt();
				System.out.println("Veuillez entrer la nouvelle quantite: ");
				int q = var.nextInt();
				bm.modifyBookedMedicin(id, q);
			}

		};

		String password;
		String username;
		int option = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Username:");
			username = sc.nextLine();
			System.out.println("Password:");
			password = sc.nextLine();
			System.out.println(admin.login(username, password));
			if (admin.login(username, password) == "connected") {
				do {

					System.out.println("1- Add Pharmacist");
					System.out.println("2- Add Medicin Stock");
					System.out.println("3- View Pharmacist Information");
					System.out.println("4- View Medicin");
					System.out.println("5- View booked medicin");
					System.out.println("6- Delete pharmacist");
					System.out.println("7- Delete booked medicin");
					System.out.println("8- Delete Medicin");
					System.out.println("9- Delete Medicin Stock");
					System.out.println("10- Exit");
					System.out.println("Choose an option: ");
					option = var.nextInt();
					switch (option) {
						case 1:
							admin.addPharmacist();
							break;
						case 2:
							admin.addMedicinStock();
							break;
						case 3:
							admin.viewPharmacistInformation();
							break;
						case 4:
							admin.viewMedicin();
							break;
						case 5:
							admin.viewbooked();
							break;
						case 6:
							admin.deletePharmacist();
							break;
						case 7:
							admin.deletebooked();
							break;
						case 8:
							admin.deleteMedicin();
							break;
						case 9:
							admin.deleteMedicinStock();
							break;
						case 10:
							System.exit(0);
							break;
					}

				} while (option != 10);
			}
			if (user.login(username, password) == "connected") {
				do {

					System.out.println("1- View Medicin");
					System.out.println("2- View Booked Medicin");
					System.out.println("3- Modify Booked Medicin");
					System.out.println("4- Exit");
					System.out.println("Choose an option: ");
					option = var.nextInt();
					switch (option) {
						case 1:
							user.viewMedicin();
							break;
						case 2:
							user.viewBookedMedicin();
							break;
						case 3:
							user.modifyBookedMedicin();
							break;
						case 4:
							System.exit(0);
							break;
					}

				} while (option != 4);
			}
			sc.close();
		} while (admin.login(username, password) != "connected" || user.login(username, password) != "connected");

		var.close();

	}

}
