public class Shirt {
    String brand;
    String color;
    String type;
    String material;
    String collar;
    String size;

    void printDetails(){
        System.out.printf("""
                Brand: %s 
                Color: %s
                Type: %s
                Material: %s
                Collar: %s
                Size: %s\n
                """, brand, color, type, material, collar, size);
    }
}
