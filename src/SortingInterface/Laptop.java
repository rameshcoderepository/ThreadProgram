package SortingInterface;

public class Laptop implements Comparable<Laptop> {

    private String brand;
    private int ramMemory;
    private int price;

    public Laptop(String brand, int ramMemory, int price) {
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
        return "Laptop{" + "brand=" + brand + ", ramMemory=" + ramMemory + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Laptop lap) {

        if (this.getRamMemory() > lap.getRamMemory()) {
            return 1;
        } else if (this.getRamMemory() < lap.getRamMemory()) {
            return -1;
        } else {
            return 0;
        }
    }

    

}
