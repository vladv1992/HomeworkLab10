package ro.Fasttrackit.Lab10;

public class Fruit {
    private String name;

    Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
