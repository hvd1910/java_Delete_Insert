package SQL.GiftShop.giftmodel;

public class Gift {
    protected int id;
    protected String name;
    protected Double price;
    protected int qty;

    public Gift(int id, String name, Double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ", " + price + ", " + qty + ")";

    }



}
