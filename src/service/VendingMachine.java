package service;

import domen.Product;

import java.util.List;

public class VendingMachine {

    private Holder holder;

    private CoinDispenser coinDispenser;

    private Display display;

    private List<Product> assort;

    //конструктор
    public VendingMachine(Holder holder, CoinDispenser coinDispenser, Display display, List<Product> assort) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        this.display = display;
        this.assort = assort;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Product> getProducts() {
        return assort;
    }

    public void setProducts(List<Product> assort) {
        this.assort = assort;
    }
}
