import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KnowledgeService service = new KnowledgeService();
        while (true) {
            System.out.println("\n=== Knowledge Transfer Platform ===");
            System.out.println("1. Add Knowledge");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    service.addKnowledge(new Knowledge(title, desc, author));
                    break;
                case 2:
                    service.viewAll();
                    break;
                case 3:
                    System.out.print("Enter Title to update: ");
                    String t = sc.nextLine();
                    System.out.print("Enter new Description: ");
                    String newDesc = sc.nextLine();
                    service.updateKnowledge(t, newDesc);
                    break;
                case 4:
                    System.out.print("Enter Title to delete: ");
                    String del = sc.nextLine();
                    service.deleteKnowledge(del);
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
