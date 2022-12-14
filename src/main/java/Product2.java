import java.util.Objects;

public class Product2 {
    private int price = 100;


    private String description = "animalProduct";


    private int productWeight = 5;

    public Product2 () {}

    public Product2 (int price, String description, int productWeight){
        this.price = price;
        this.description = description;
        this.productWeight = productWeight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product2 product2 = (Product2) o;
        return price == product2.price && productWeight == product2.productWeight && Objects.equals(description, product2.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, productWeight);
    }
}
