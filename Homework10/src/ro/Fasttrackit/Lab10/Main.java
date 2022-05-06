package ro.Fasttrackit.Lab10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.aduagaFuct(new Fruit("prune"));
        System.out.println(basket);
        basket.aduagaFuct(new Fruit("persici"));
        System.out.println(basket);
        basket.aduagaFuct(new Fruit("nuci"));

        List<Fruit> existaFruct = new ArrayList<>();
        existaFruct.add(new Fruit("Corcoduse"));
        System.out.println(basket);
        System.out.println(existaFruct);

    }
}