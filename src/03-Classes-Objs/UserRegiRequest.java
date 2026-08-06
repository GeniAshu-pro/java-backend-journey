package DemoclassesObjs;

public  record UserRegiRequest(String username, String email, int age) {

    public UserRegiRequest(String username, String email, int age) {
        if (age >= 18) {
            this.age = age;
        } else {
         throw new IllegalArgumentException("User age must be 18 or above") ;
        }
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Plz enter valid email address and it must contain '@' ") ;
        }
        if (username==null || username.isBlank()) {
            throw  new IllegalArgumentException("Username should not be null or empty");
        } else {
            this.username = username;
        }

    }
}
