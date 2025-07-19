public class Accessmodifier {
    public static void main(String[] args) {
        BankAccount Myacc = new BankAccount();
        Myacc.username = "Sakshi";
        System.out.println(Myacc.username);
        Myacc.setpassword("abc");
        System.out.println(Myacc.getpasssword());

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setpassword(String password) {
        this.password = password;
    }

    String getpasssword() {
        return this.password;
    }

}
