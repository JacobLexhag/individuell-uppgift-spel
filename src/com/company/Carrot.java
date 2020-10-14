package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;
public class Carrot extends Food {

    static int initialFoodPrice = 20;

    public Carrot(int gainHealth, int foodPricePerKG, String name) {
        super(gainHealth, foodPricePerKG, name);

    }

    public static Food buyCarrot() {
        return new Grass(10, 20, "Carrot");
    }

}


