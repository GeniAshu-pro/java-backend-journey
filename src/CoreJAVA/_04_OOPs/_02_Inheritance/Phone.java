package _04_OOPs._02_Inheritance ;

public class Phone {
 private   String storage ;
    private String RAM ;

    public Phone( String storage ,String RAM) {
        this.storage = storage ;
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    public void displayInfo(){
        System.out.println("Storage: "+getStorage()+ "RAM: "+getRAM());
    }

}
