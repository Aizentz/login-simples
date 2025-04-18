package App;

import LoginInterface.NewLogin;

public class AppOne {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Login interface");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("""
                set 1 for a new account
                set 2 for Login
                """);
        System.out.print("-> ");
        int choice = Integer.parseInt(scanner.nextLine());

        while(choice < 1 || choice > 2){
            System.out.print("-> ");
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 1) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("your username: ");
            String user = scanner.nextLine();
            System.out.print("your password: ");
            String pass = scanner.nextLine();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            NewLogin a1 = new NewLogin(user,pass);
            a1.loginMethod();


        }else {

            NewLogin a1 = new NewLogin("Otavio mesquita", "tavão123");
            a1.loginMethod();
        }

    }

}
