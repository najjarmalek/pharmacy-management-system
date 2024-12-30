package identity;

public  abstract class User {
	private String userName="user";
    private String password="user1234";


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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


    abstract void viewMedicin();
    abstract void viewBookedMedicin();
    abstract void modifyBookedMedicin(String a);
    abstract void viewMedicinBookList();

}
