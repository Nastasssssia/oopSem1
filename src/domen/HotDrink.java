package domen;

public class HotDrink extends Product{

    int tempetature;

    public HotDrink(String name, int price, int place, String type, int tempetature) {
        super(name, price, place, type);
        this.tempetature = tempetature;
    }

    public int getTempetature() {
        return tempetature;
    }

    public void setTempetature(int tempetature) {
        this.tempetature = tempetature;
    }


    @Override
    public String toString() {
        return super.toString() + ", temperature = " + tempetature;
    }
}
