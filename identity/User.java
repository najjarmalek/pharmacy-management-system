package identity;

public  abstract class User {
	private String userName="user";
    private String password="user1234";


    public User () {
    	
    }

    public String login(String a,String b){
    	if (userName.equals(a) && password.equals(b))
            return "connected";
        else
            return "verify your name or password";
    }


    public String getUsername() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public abstract void viewMedicin();
    public abstract void viewBookedMedicin();
    public abstract void modifyBookedMedicin();
    

}
