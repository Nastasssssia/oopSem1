package domen;

public class Bottle extends Product{

    private double volume;

    public Bottle(String name, int price, int place, String type, double volume) {
        super(name, price, place, type);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    //переопределяем метод toString, с помощью обращения super берем toString из класса Produkt
    // и добавляем к нему новый параметр для Bottle volume
    @Override
    public String toString() {
        return super.toString() + ", volume= " + volume;
    }
}
