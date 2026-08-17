package _03_Classes_Objs;

public class Shoeschecks {
    public static void main(String[] args) {
          Shoes runningboots1 = new Shoes ("Nike" , 2);
        Shoes runningboots2 = new Shoes("Adidas" , 5);
        Shoes runningboots3 = new Shoes("Vector X" , 1);
//        To remove these extra lline we'll use constructor
//        runningboots.brand = "Nike";
//        runningboots.quantity = 1;
//        runningboots1.qualityCheck();
        System.out.println("Brand Name :  "+runningboots1.brand());
//        runningboots1.setBrand("Adidas");
        System.out.println( runningboots1);



    }


}
