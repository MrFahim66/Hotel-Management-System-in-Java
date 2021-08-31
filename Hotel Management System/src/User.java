public class User {
    protected String userName, userPass;

    public User() {
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public void displayUser(){
        System.out.println("Name     : "+this.getUserName());
        System.out.println("Password : "+this.getUserPass());
    }

}
