public class Main {
    public static void main(String[] args) {
        //-------------------------------------Inventory Creation----------------------------------------------------------------------------------------|
        Book[] inventory= new Book[20];
        inventory[0] = new Book(101, "9780134685991", false, "", "Effective Java");
        inventory[1] = new Book(102, "9780132350884", false, "", "Clean Code");
        inventory[2] = new Book(103, "9780596009205", true, "Eric", "Head First Java");
        inventory[3] = new Book(104, "9780135957059", true, "Will", "The Pragmatic Programmer");
        inventory[4] = new Book(105, "9780201633610", true, "Camila", "Design Patterns");
        inventory[5] = new Book(106, "9780134757599", false, "", "Refactoring");
        inventory[6] = new Book(107, "9781617292231", false, "", "Grokking Algorithms");
        inventory[7] = new Book(108, "9780262046305", false, "", "Introduction to Algorithms");
        inventory[8] = new Book(109, "9781593279929", false, "", "Automate the Boring Stuff with Python");
        inventory[9] = new Book(110, "9781593279288", true, "David", "Python Crash Course");
        inventory[10] = new Book(111, "9780131103627", false, "", "The C Programming Language");
        inventory[11] = new Book(112, "9781593279523", false, "", "The Linux Command Line");
        inventory[12] = new Book(113, "9780061120084", false, "", "To Kill a Mockingbird");
        inventory[13] = new Book(114, "9780451524935", true, "Maria", "1984");
        inventory[14] = new Book(115, "9780743273565", false, "", "The Great Gatsby");
        inventory[15] = new Book(116, "9780062316097", false, "", "Sapiens");
        inventory[16] = new Book(117, "9780735211292", false, "", "Atomic Habits");
        inventory[17] = new Book(118, "9780062457714", false, "", "The Subtle Art of Not Giving a F*ck");
        inventory[18] = new Book(119, "9781451648539", true, "Peter", "Steve Jobs");
        inventory[19] = new Book(120, "9780553380163", false, "", "A Brief History of Time");
        //-------------------------------------Inventory Creation----------------------------------------------------------------------------------------|

        int selection;
        do{
            selection = Console.displayHomeScreen();
            switch (selection) {
                case 1 ->{
                    showAvailableBooks(inventory);
                    //Searching for ID---------------------------------------------------------------------------------|
                    int areWeSearchingById = Console.promptForInt("1- Search by Id \n0- Go back\n");
                    if(areWeSearchingById == 1){
                        int index = searchById(inventory);


                        if (index > -1){ //Error handeling, what if index of the ID is -1?------------------------------|
                            String name = Console.promptForString("Enter your name: ");
                            inventory[index].checkOut(name);
                        }else {
                            System.out.println("Thats not a valid Id");
                        }
                    }
                }
                case 2 -> {
                    showCheckedOutBooks(inventory);
                    //Searching for ID---------------------------------------------------------------------------------|
                    String areWeSearchingById = Console.promptForString("c- Id to check in\nx- Go back\n");
                    if(areWeSearchingById.equalsIgnoreCase("C")){
                        int index = searchById(inventory);


                        if (index > -1){ //Error handeling, what if index of the ID is -1?------------------------------|
                            inventory[index].checkIn();
                        }else {
                            System.out.println("Thats not a valid Id");
                        }
                    }

                }
                case 3 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid selection.");
            }
        }while(selection !=3);



    }
    //To show the available books
    private static void showAvailableBooks(Book[] inventory) {
        for (int i = 0; i < inventory.length; i++){
            if (!inventory[i].isCheckedOut()) {
                System.out.printf("%-6d %-18s %-40s%n",
                        inventory[i].getId(),
                        inventory[i].getIsbn(),
                        inventory[i].getTitle()
                );
            }
        }


    }

    private static void showCheckedOutBooks(Book[] inventory) {
        System.out.printf("%-6s %-18s %-40s %-20s%n",
                "ID", "ISBN", "TITLE", "BORROWED BY");
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i].isCheckedOut()) {
                System.out.printf("%-6d %-18s %-40s %-20s%n",
                        inventory[i].getId(),
                        inventory[i].getIsbn(),
                        inventory[i].getTitle(),
                        inventory[i].getCheckedOutTo()
                );
            }
        }

    }

    public static int searchById(Book[] inventory){
        int id = Console.promptForInt("What is the Id: ");

        for(int i = 0; i <inventory.length; i++){
            if(id == inventory[i].getId()){
                System.out.println(inventory[i].getId());
                return i; //index position
            }

        }

        return -1;//Returning value if id is not valid input
    }


}