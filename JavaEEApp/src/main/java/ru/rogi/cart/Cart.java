package ru.rogi.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Good> goods  = new ArrayList<>();

    public List<Good> getGoods() {
        return goods;
    }

    public void addGood(Good good){
        goods.add(good);
    }
}
