package Collections.Task7;

public class Toy {
    String name;
    int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
