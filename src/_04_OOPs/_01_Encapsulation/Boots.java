package _04_OOPs._01_Encapsulation ;

public class Boots {
    private String brand;
    private int quantity;
    private Double price;

    public Boots (String brand , double price){
        this.brand =brand;
        setPrice(price);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price <=0){
            System.out.println("Invalid !! plz enter positive Number");
        }else {
            this.price = price;
        }
    }
}
