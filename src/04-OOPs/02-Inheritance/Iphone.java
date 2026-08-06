package Inheritance;

public class Iphone extends Phone {
     private String camera ;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Iphone(String storage, String RAM , String camera) {
        super(storage, RAM);
        this.camera= camera;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        System.out.println("Storage: "+getStorage()+ "RAM: "+getRAM()+"Camera: "+camera);

    }
}
