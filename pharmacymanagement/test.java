
import identity.user;
import identity.admin;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        
        System.out.println("############# Welcome to the Pharmacy Management System #############");
        admin admin=new admin();
        do{
            System.out.println("username:");
            Scanner sc=new Scanner(System.in);
            String username=sc.nextLine();
            System.out.println("password:");
            String password=sc.nextLine();
            System.out.println(admin.login(username,password));
            
        }while(true);
            

    }
}
