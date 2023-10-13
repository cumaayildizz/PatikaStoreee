import java.util.TreeSet;

public abstract class TechnologyProduct {
    private int id;
    private Brand brands;
    private String name;
    private int unitPrice;
    private String ram;
    private int discountRate;
    private int stockAmount;
    private String screenSize;

    public TechnologyProduct(int id, Brand brands, String name, int unitPrice, String ram, String screenSize ,int stockAmount) {
        this.id = id;
        this.brands = brands;
        this.name = name;
        this.unitPrice = unitPrice;
        this.ram = ram;
        this.screenSize = screenSize;
        this.stockAmount = stockAmount;
    }
    public TechnologyProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrands() {
        return brands;
    }

    public void setBrands(Brand brands) {
        this.brands = brands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
