import java.util.Scanner;

public class Main {
//    public static void main(String [] args){
//        System.out.println("Hello world!");
//    }

    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();

        Contact friendJuki = new Contact();
        friendJuki.name = "Juki";
        friendJuki.phoneNumber = "013356258";
        myContactManager.addContact(friendJuki);

        Contact friendSarimin = new Contact();
        friendJuki.name = "Sarimin";
        friendJuki.phoneNumber = "044568958";
        myContactManager.addContact(friendSarimin);

        Contact friendUnyil = new Contact();
        friendJuki.name = "Unyil";
        friendJuki.phoneNumber = "06288569845";
        myContactManager.addContact(friendUnyil);

        Contact result = myContactManager.searchContact("Unyil");
        System.out.println(result.phoneNumber);

        /////////////////////////////////
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }

    }
}
