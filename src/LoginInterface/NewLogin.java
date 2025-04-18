package LoginInterface;


public class NewLogin implements Login{
    private final String userName;
    private final String passWord;

    public NewLogin(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public void loginMethod() {
        var scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Login: ");
            String user = scanner.nextLine();
            System.out.print("Password: ");
            String pass = scanner.nextLine();

            if(user.equalsIgnoreCase(admUser) && pass.equalsIgnoreCase(admPass)){
              break;
            } else if (user.equalsIgnoreCase(userName) && pass.equalsIgnoreCase(passWord)) {
                break;
            }else{
                System.out.println("Your nickname or pass are wrong, please, check them");
            }
        }
        System.out.println("Welcome back, sir!");

    }
}
