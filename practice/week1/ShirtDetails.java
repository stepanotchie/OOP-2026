public class ShirtDetails {
    public static void main(String[] args) {
        Shirt obj1 = new Shirt();
        obj1.brand = "Penshoppe";
        obj1.color = "Black";
        obj1.type = "Polo shirt";
        obj1.material = "Cotton";
        obj1.collar = "V-neck";
        obj1.size = "Medium";

        Shirt obj2 = new Shirt();
        obj2.brand = "Bench";
        obj2.color = "Red";
        obj2.type = "T-shirt";
        obj2.material = "Polyester";
        obj2.collar = "Crew neck";
        obj2.size = "Large";

        System.out.println("\nSHIRT OPTIONS\n\nOption 1: ");
        obj1.printDetails();
        System.out.println("Option 2: ");
        obj2.printDetails();
    }
}
