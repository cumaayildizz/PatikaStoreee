import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NotebookOperation {

    private NoteBook noteBooks;
    private static int nextId = 4;

    public static Scanner scanner = new Scanner(System.in);

    public NotebookOperation(NoteBook noteBooks) {
        this.noteBooks = noteBooks;
    }

    public NotebookOperation() {
    }

    public void NotebookLogin(){}



    public static TreeSet<NoteBook> notebookList = new TreeSet<>(new Comparator<NoteBook>() {
        @Override
        public int compare(NoteBook o1, NoteBook o2) {
            return o1.getId() - o2.getId();
        }
    });

    static {
        //(int id, Brand brands, String name, int unitPrice, int discountRate, int stockAmount, String storage)
        notebookList.add(new NoteBook(1, new Brand(4 ,"Huawei"), "HUAWEI Matebook", 7000, "16 GB", "16.4" , 14, " 1 TB "));
        notebookList.add(new NoteBook(2, new Brand(2,"Lenovo"), "LENOVO V14 IGL", 3699, "16 GB", "17.1" , 15, "500 GB"));
        notebookList.add(new NoteBook(3, new Brand(6,"Asus  "), "ASUS Tuf Gaming",8199, "32 GB", "15.5", 12, " 1 TB "));
        notebookList.add(new NoteBook(4, new Brand(3,"Monster"), "MONSTER Tulbar",9900, "16 GB", "17.5" , 40, " 2 TB "));
    }

    public static boolean notebookLogin(){
        System.out.println();
        System.out.println("                                         NOTEBOOK  STORE ");
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
        System.out.print("Screen Size : ");
        String screenSize = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Stock Amount : ");
        int stockAmount = scanner.nextInt();
        System.out.println("---------------------------");
        System.out.print("RAM : ");
        String ram = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.print("Storage Space : ");
        String storage = scanner.nextLine();
        System.out.println("---------------------------");

        // (1, new Brand(4 ,"Huawei"), "HUAWEI Matebook", 7000, "16 GB", "16.4" , 14, " 1 TB ")
        notebookList.add(new NoteBook(getNextId(), newBrand , name ,unitPrice ,ram ,screenSize , stockAmount , storage));

        System.out.println();
        System.out.println("Your product has been added to the list");
        notebookLogin();
    }

    public static void removeProduct(){
        NoteBook removedProduct = null;
        System.out.print("Enter the ID number of the product you want to delete :");
        int selectId = scanner.nextInt();
        for (NoteBook remove : notebookList){
            if (selectId == remove.getId()){
                removedProduct = remove;
                System.out.println(remove.getId());
            }
        }
        if (removedProduct == null){
            System.out.println("The product with the ID number you entered could not be reached.");
        }else {
            notebookList.remove(removedProduct);
            System.out.println("Product with ID number" + selectId + "has been removedProduct from the market");
        }
        notebookLogin();


    }


    public static void print(){
        System.out.println("=====================================================================================================");
        System.out.println("| ID | Product Name         \t| Unit Price    | Brad          | Storage   | Screen Size   | RAM   |");
        System.out.println("=====================================================================================================");
        for ( NoteBook noteBooks : notebookList){
            System.out.print("| " + noteBooks.getId() + "  | " + noteBooks.getName() + "\t\t\t| " + noteBooks.getUnitPrice() + "\t\t\t| " + noteBooks.getBrands().getName()
            + "\t\t| " + noteBooks.getStorage() + "\t| " + noteBooks.getScreenSize() + "\t\t\t| " + noteBooks.getRam() + "\t|\n");
            System.out.println("-----------------------------------------------------------------------------------------------------");

        }
        System.out.println();
    }


    public NoteBook getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(NoteBook noteBooks) {
        this.noteBooks = noteBooks;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        NotebookOperation.nextId = nextId;
    }
}
