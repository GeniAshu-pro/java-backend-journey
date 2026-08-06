package DemoclassesObjs;

public class SendsToF_User {
    public static void main(String[] args) {
      try{
          ShoesEntity S1 = new ShoesEntity("786","Nike", 2000 ,5);
          ShoesResponseDTO response_user = new ShoesResponseDTO(S1.getBrand(), S1.getPrice());
          System.out.println("Brand: "+S1.getBrand()+" StockQuantity: "+S1.getStockQuantity());
          System.out.println(response_user);
          System.out.println(S1.toString());

      }
      catch (IllegalArgumentException  e){
          System.out.println("Validation failed  "+ e.getMessage());      }
    }
}
