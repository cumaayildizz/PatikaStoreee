import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SmartPhoneOperation {
    private SmartPhone smartPhone;
    private static int nextId = 4;
    public static Scanner scanner = new Scanner(System.in);

    public SmartPhoneOperation(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    public static TreeSet<SmartPhone> smartPhonesList = new TreeSet<>(new Comparator<SmartPhone>() {
        @Override
        public int compare(SmartPhone o1, SmartPhone o2) {
            return o1.getId() - o2.getId();
        }
    });

    static {
        smartPhonesList.add(new SmartPhone(1, new Brand(5 ,"Samsung"), "SAMSUNG GALAXY A51", 3199, "32 GB", "8.3" ,12,"32 GB", "4000", "Black"));
        smartPhonesList.add(new SmartPhone(2, new Brand(1, "Apple  "), "iPhone 11           ", 7379, "16 GB","6.2" ,5, " 64 GB", "3046", "Blue"));
        smartPhonesList.add(new SmartPhone(3, new Brand(8, "Xiaomi "), "Redmi Note 10 Pro   ", 4012, "8 GB", "8.5" , 20, "64 GB",  "4000", "White"));
        smartPhonesList.add(new SmartPhone(4, new Brand(1, "Apple  "), "Ipohone X        ", 35000, "32 GB", "7.1" ,10, "128 GB", "3046" , "Black" ));


    }

    public static boolean smartPhoneLogin(){
        System.out.println();
        System.out.println("                                            SMART PHONE  STORE ");
        print();
        System.out.println();
        System.out.println(" < 1 > Add Product             < 2 > Remove Product" );
        System.out.println(" < 3 > Return PATIKA STORE     < 0 > Exit" );
        int  entriesNumber = 3;
        String selectCase;
        do {
        System.out.print("Please make your choice : ");
        selectCase = scanner.nextLine().trim();  //We trim possible unnecessary spaces with the trim function
        System.out.println("-------------------------------------------------");

        if (!(selectCase.equals("0") ||selectCase.equals("1") || selectCase.equals("2") || selectCase.equals("3"))){
            entriesNumber--;
            System.out.println("Wrong choice!! Please select one of the specified actions.");
            System.out.println("remaining right to enter : " + entriesNumber);
            if (entriesNumber == 0){
                System.out.println("You have entered too many incorrect entries!!");
                return false;
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
            addProduct();
            break;
        case "2":
            removeProduct();
            break;
        case "3":
            PatikaStore.storeEntrance();
        default:
            return true;

        }
        return true;
    }
    public static void nextId(){
        setNextId(getNextId() + 1);
    }

    public static void addProduct() {

        System.out.println("Write the features of the product you want to add.");

        nextId(); //increases by 1 each time a new product is produced
        System.out.println("---------------------------");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Unit Price : ");
        int unitPrice =(int)scanner.nextDouble();
        System.out.println("---------------------------");
        System.out.print("Brand : ");
        String brandN = scanner.nextLine();
        Brand newBrand = new Brand(getNextId(),brandN);
        System.out.println("---------------------------");
        System.out.print("Memory : ");
        String memory = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Screen Size : ");
        String screenSize = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Stock Amount : ");
        int stockAmount = scanner.nextInt();
        System.out.println("---------------------------");
        System.out.print("RAM : ");
        String ram = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Battery Power : ");
        String batteryPower = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Color : ");
        String color = scanner.nextLine();
        // smartPhonesList.add(new SmartPhone(1, new Brand(5 ,"Samsung"), "SAMSUNG GALAXY A51", 3199, "32 GB", "8.3" ,12,"32 GB", "4000", "Black"));
        smartPhonesList.add(new SmartPhone(getNextId(), newBrand , name ,unitPrice ,memory ,screenSize ,stockAmount ,ram ,batteryPower ,color));

        System.out.println();
        System.out.println("Your product has been added to the list");
        smartPhoneLogin();
    }

    public static void removeProduct(){
        SmartPhone removedProduct = null;
        System.out.print("Enter the ID number of the product you want to delete :");
        int selectId = scanner.nextInt();
        for (SmartPhone remove : smartPhonesList){
            if (selectId == remove.getId()){
                removedProduct = remove;
                System.out.println(remove.getId());
            }
        }
        if (removedProduct == null){
            System.out.println("The product with the ID number you entered could not be reached.");
        }else {
            smartPhonesList.remove(removedProduct);
            System.out.println("Product with ID number" + selectId + "has been removedProduct from the market");
        }
        smartPhoneLogin();


    }

    public static void print(){
        System.out.println("=====================================================================================================================");
        System.out.println("| ID | Product Name                \t| Unit Price    | Brad          | Battery Power | Screen Size   | RAM   | Color |");
        System.out.println("=====================================================================================================================");
        for ( SmartPhone smartPhones : smartPhonesList){
            System.out.print("| " + smartPhones.getId() + "  | " + smartPhones.getName() + "\t\t\t| " + smartPhones.getUnitPrice() + "\t\t\t| " + smartPhones.getBrands().getName()
                    + "\t\t| " + smartPhones.getBatteryPower() + "\t\t\t| " + smartPhones.getScreenSize() + "\t\t\t| " + smartPhones.getRam() + "\t| " + smartPhones.getColor() + "\t|\n");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");

        }
        System.out.println();
    }
    public SmartPhoneOperation() {
    }

    SmartPhone smartPhoneObj = new SmartPhone();

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        SmartPhoneOperation.nextId = nextId;
    }


    public SmartPhone getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }
}
