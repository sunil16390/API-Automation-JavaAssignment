/*
    Write a program to create 3 overloaded constructors and print all the 3 overloaded constructors.
 */
package Problem24;

public class Laptop
{
    private String brand;
    private String model;
    private int year;
    // Constructor with no parameters
    public Laptop()
    {
        this("Brand Unknown", "Model Unknown", 0);
    }
    // Constructor with two parameters
    public Laptop(String brand, String model)
    {
        this(brand, model, 0);
    }
    // Constructor with all three parameters
    public Laptop(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args)
    {
        Laptop asset_1 = new Laptop();
        System.out.println("Asset_1 - Brand: " + asset_1.brand + ", Model: " + asset_1.model + ", Year: " + asset_1.year);
        Laptop asset_2 = new Laptop("Hp", "Zbook Fierfly");
        System.out.println("asset_2 - Brand: " + asset_2.brand + ", Model: " + asset_2.model + ", Year: " + asset_2.year);
        Laptop asset_3 = new Laptop("Apple", "MacBook Air 15", 2023);
        System.out.println("Asset_3 - Brand: " + asset_3.brand + ", Model: " + asset_3.model + ", Year: " + asset_3.year);
    }
}
