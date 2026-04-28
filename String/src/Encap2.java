class Smartphone {
    // Private instance variables
    private String brand;
    private String model;
    private int storageCapacity; // in GB

    // Constructor
    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for storageCapacity
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity >= 0) {
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Storage capacity cannot be negative!");
        }
    }

    // Method to increase storage with validation
    public void increaseStorage(int extraStorage) {
        if (extraStorage > 0) {
            storageCapacity += extraStorage;
            System.out.println("Storage increased by " + extraStorage + " GB. Total: " + storageCapacity + " GB.");
        } else {
            System.out.println("Invalid value! Extra storage must be positive.");
        }
    }
}

// Demo class
public class Encap2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S25", 128);

        // Display initial details
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + " GB");

        // Increase storage
        phone.increaseStorage(64);
        phone.increaseStorage(-20); // invalid
    }
}
