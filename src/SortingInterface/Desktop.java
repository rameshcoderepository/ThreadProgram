package SortingInterface;

public class Desktop {

    private String brand;
    private int ramMemory;
    private int price;

    public Desktop(String brand, int ramMemory, int price) {
        this.brand = brand;
        this.ramMemory = ramMemory;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desktop{" + "brand=" + brand + ", ramMemory=" + ramMemory + ", price=" + price + '}';
    }

}
