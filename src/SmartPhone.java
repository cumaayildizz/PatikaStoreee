public class SmartPhone extends TechnologyProduct{
    private String memory;
    private String batteryPower;
    private String color;

    public SmartPhone(int id, Brand brands, String name, int unitPrice, String ram, String screenSize ,int stockAmount, String memory, String batteryPower, String color) {
        super(id, brands, name, unitPrice, ram, screenSize ,stockAmount);
        this.memory = memory;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public SmartPhone() {
    }
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(String batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
