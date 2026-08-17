package _04_OOPs._02_Inheritance ;

public class Samsung extends Phone {
    String display;

    public Samsung(String storage, String RAM ,String display) {
        super(storage, RAM);
        this.display=display;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        System.out.println("Storage: "+getStorage()+ "RAM: "+getRAM()+ " display: "+display);

    }
}
