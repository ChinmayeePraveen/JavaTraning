import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValidUsername() {
        return username.matches("[a-zA-Z]+");
    }

    public boolean isValidPassword() {
        return password.matches("[a-zA-Z]+");
    }
}

class LoginPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        if (!user.isValidUsername() || !user.isValidPassword()) {
            System.out.println("Invalid username or password. Both should contain only letters.");
        } else {
            System.out.println("Login successful!");
        }

        scanner.close();
    }
}
