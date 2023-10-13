import java.util.Comparator;
import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;

    public static TreeSet<Brand> brandTreeSet = new TreeSet<>(new Comparator<Brand>() {
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Brand() {
    }

    static {
        brandTreeSet.add(new Brand(1 , "Apple"));
        brandTreeSet.add(new Brand(2 , "Lenovo"));
        brandTreeSet.add(new Brand(3 , "Monster"));
        brandTreeSet.add(new Brand(4 , "Huawei"));
        brandTreeSet.add(new Brand(5 , "Samsung"));
        brandTreeSet.add(new Brand(6 , "Asus"));
        brandTreeSet.add(new Brand(7 , "HP"));
        brandTreeSet.add(new Brand(8 , "Xiaomi"));
        brandTreeSet.add(new Brand(9 , "Casper"));
    }

    public static void print(){

        System.out.println("*Our Brands*");
        for ( Brand brand : brandTreeSet){
            System.out.println("-" + brand.getName());
        }
        System.out.println("-------------------------------------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
