package ro.Fasttrackit.Lab10;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Fruit> cumparaturi;

    public Basket() {
        this.cumparaturi = new ArrayList<>();
        this.cumparaturi.add(new Fruit("cirese"));
    }

    public Basket(List<Fruit> existaFruct) {
        this.cumparaturi = existaFruct;

    }

    public boolean aduagaFuct(Fruit newFruit) {
        return cumparaturi.add(newFruit);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "cumparaturi=" + cumparaturi +
                '}';
    }
}
