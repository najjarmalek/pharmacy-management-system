package identity;
public abstract class user {
    private String username="user";
    private String password="user1234";


    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String login(String a,String b){
        if(username==a && b==password)
            return "connected";
        else
            return "verify your name or password";
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }
    
    
    abstract void viewMedicin();
    abstract void viewbookMedicin();
    abstract void modifyBookMedicin(String a);
    abstract void viewMedicinBookList();
}
