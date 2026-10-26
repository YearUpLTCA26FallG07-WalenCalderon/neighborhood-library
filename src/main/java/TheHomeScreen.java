import java.util.Scanner;

public class TheHomeScreen {

    public static void displayHomeScreen() {
        Scanner sc = new Scanner(System.in);
        int selection = 0;//Variable to register the selection of user

        //Looping through the menu again and again
        while (selection != 3) {
            System.out.println("Welcome to TheHomeScreen");

            System.out.println("1- Show Available Books"); //• Show Available Books - Displays a list of all books that are not currently checked  out. Display the Id, ISBN and Title of the book.
            System.out.println("2- Show Checked Out Books");
            System.out.println("3- Exit - closes out of the application");
            selection = sc.nextInt();
            }
        }



    }





}
