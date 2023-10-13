public class NoteBook extends TechnologyProduct{
    private String storage;
    public NoteBook(int id, Brand brands, String name, int unitPrice, String ram, String screenSize ,int stockAmount, String storage) {
        super(id, brands, name, unitPrice, ram, screenSize ,stockAmount);
        this.storage = storage;
    }

    public NoteBook() {
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
