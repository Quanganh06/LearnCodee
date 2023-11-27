package ss12.bt;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {


    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ten='" + name + '\'' +
                ", gia=" + price +
                '}';
    }

    protected void add(Product product) {
    }

}
