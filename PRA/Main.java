import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "admin123";
    private static HashMap<String, String> underwriters = new HashMap<>();
    private static List<Underwriter> underwriterList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Star Protect Vehicle System ---");
            System.out.println("1. Admin Login");
            System.out.println("2. Underwriter Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    adminLogin(scanner);
                    break;
                case "2":
                    underwriterLogin(scanner);
                    break;
                case "3":
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter Admin Username: ");
        String user = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (user.equals(ADMIN_USER) && password.equals(ADMIN_PASS)) {
            System.out.println("Admin Login Successful!");
            adminMenu(scanner);
        } else {
            System.out.println("Invalid Admin Credentials!");
        }
    }

    private static void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Underwriter");
            System.out.println("2. Remove Underwriter");
            System.out.println("3. View Underwriters");
            System.out.println("4. Search Underwriter");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addUnderwriter(scanner);
                    break;
                case "2":
                    removeUnderwriter(scanner);
                    break;
                case "3":
                    viewUnderwriters();
                    break;
                case "4":
                    searchUnderwriter(scanner);
                    break;
                case "5":
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addUnderwriter(Scanner scanner) {
        System.out.print("Enter Underwriter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Underwriter DOB (dd/MM/yyyy): ");
        String dobStr = scanner.nextLine();
        System.out.print("Enter Underwriter Joining Date (dd/MM/yyyy): ");
        String joiningDateStr = scanner.nextLine();
        System.out.print("Enter Default Password: ");
        String defaultPassword = scanner.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = sdf.parse(dobStr);
            Date joiningDate = sdf.parse(joiningDateStr);

            Underwriter underwriter = new Underwriter(name, dob, joiningDate, defaultPassword);
            underwriterList.add(underwriter);
            System.out.println("Underwriter added successfully!");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    private static void removeUnderwriter(Scanner scanner) {
        System.out.print("Enter Underwriter ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Underwriter toRemove = null;
        for (Underwriter underwriter : underwriterList) {
            if (underwriter.getUnderwriterId() == id) {
                toRemove = underwriter;
                break;
            }
        }

        if (toRemove != null) {
            underwriterList.remove(toRemove);
            System.out.println("Underwriter removed successfully!");
        } else {
            System.out.println("Underwriter not found!");
        }
    }

    private static void viewUnderwriters() {
        System.out.println("\nRegistered Underwriters:");
        if (underwriterList.isEmpty()) {
            System.out.println("No underwriters registered.");
        } else {
            for (Underwriter underwriter : underwriterList) {
                System.out.println(underwriter);
            }
        }
    }

    private static void searchUnderwriter(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Search Underwriter ---");
            System.out.println("1. View all Underwriters");
            System.out.println("2. View Underwriter by ID");
            System.out.println("3. Back to Admin Menu");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewUnderwriters();
                    break;
                case "2":
                    viewUnderwriterById(scanner);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void viewUnderwriterById(Scanner scanner) {
        System.out.print("Enter Underwriter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Underwriter found = null;
        for (Underwriter underwriter : underwriterList) {
            if (underwriter.getUnderwriterId() == id) {
                found = underwriter;
                break;
            }
        }

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Invalid Underwriter ID");
            System.out.println("1. Re-Enter Underwriter ID");
            System.out.println("2. Go Back to the previous Screen");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewUnderwriterById(scanner);
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Invalid choice! Returning to previous screen.");
            }
        }
    }

    private static void underwriterLogin(Scanner scanner) {
        System.out.print("Enter Underwriter Username: ");
        String user = scanner.nextLine();
        System.out.print("Enter Underwriter Password: ");
        String password = scanner.nextLine();

        if (underwriters.containsKey(user) && underwriters.get(user).equals(password)) {
            System.out.println("Underwriter Login Successful!");
            underwriterMenu(scanner);
        } else {
            System.out.println("Invalid Underwriter Credentials!");
        }
    }

    private static void underwriterMenu(Scanner scanner) {
        System.out.println("\n--- Underwriter Menu ---");
        System.out.println("Welcome, Underwriter! Feature development in progress...");
        System.out.println("Press Enter to logout.");
        scanner.nextLine();
    }
}