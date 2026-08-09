package DemoclassesObjs;

public class ShoesEntity {
    private String id;
    private String brand;
    private int price;
    private int stockQuantity;

    public ShoesEntity(String id, String brand, int price, int stockQuantity) {
        this.id = id;
        this.brand = brand;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Prize cannot be negative");
        }
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("StockQuantity cannot be negative");
        }
        this.stockQuantity = stockQuantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
