package DemoclassesObjs;

public class Checks {
    public static void main(String[] args) {
        System.out.println("Testing invalid user");
        try {
            UserRegiRequest Validation = new UserRegiRequest("ashutosh","ashu2003" ,15);
            System.out.println(Validation.email());
            System.out.println(Validation.age());
            System.out.println(Validation.username());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Testing valid user");
        try {
            UserRegiRequest Validation = new UserRegiRequest("ashutosh","ashu@2003" ,18);
            System.out.println(Validation.email());
            System.out.println(Validation.age());
            System.out.println(Validation.username());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
