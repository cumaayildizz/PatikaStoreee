import java.util.Scanner;

public class PatikaStore {

    public static Scanner scanner = new Scanner(System.in);

    public PatikaStore() {
    }

    public static boolean storeEntrance(){

        String selectCase;
        int entriesNumber = 5; //right of entry
        do{
            System.out.println(" < 1 > Smart Phone Login    < 2 > Notebook Login" );
            System.out.println(" < 3 > Brand List           < 0 > Exit " );
            System.out.println("-------------------------------------------------");
            System.out.print("Please make your choice : ");
            selectCase = scanner.nextLine().trim();  //We trim possible unnecessary spaces with the trim function
            System.out.println("-------------------------------------------------");

            if (!(selectCase.equals("0") ||selectCase.equals("1") || selectCase.equals("2") || selectCase.equals("3"))){
                entriesNumber--;
                System.out.println("Wrong choice!! Please select one of the specified actions.");
                System.out.println("remaining right to enter : " + entriesNumber);
                if (entriesNumber == 0){
                    System.out.println("You have entered too many incorrect entries!!");
                    break;
                }
                System.out.println();
            }
        }while (!(selectCase.equals("0") ||selectCase.equals("1") || selectCase.equals("2") || selectCase.equals("3")));

        switch (selectCase){
            case "0":
                System.out.println();
                System.out.println("Checking out of the Patika Store" +
                        "\n\t See you later");
                return false;
            case "1":
                SmartPhoneOperation.smartPhoneLogin();
                break;
            case "2":
                NotebookOperation.notebookLogin();
                break;
            case "3":
                Brand.print();
                storeEntrance();
            default:
                return true;

        }
        return true;
    }



}
