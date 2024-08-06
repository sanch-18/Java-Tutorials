
abstract class pen{
    void greet(){
        System.out.println("Heyy! I am a pen");
    }
    abstract void write();
    abstract void refill();
}

class FountainPen{
    void write()
    {
        System.out.println("Writing...");
    }
    void refill()
    {
        System.out.println("Refilling");
    }
}

interface Camera{
    void takeSnap();
}

interface Wifi{
    void getNetwork();
}

interface VideoCamera extends Camera{
    void takeVideos();
}

class CellPhone{
    public void call(long num){
        System.out.println("Calling "+num);
    }
}
class SmartPhone extends CellPhone implements VideoCamera, Wifi{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void getNetwork()
    {
        System.out.println("Connecting....");
    }
    public void takeVideos()
    {
        System.out.println("Taking videos");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        CellPhone a = new SmartPhone();
        a.call(9892034);
        SmartPhone b = new SmartPhone();
        b.takeSnap();
        b.takeVideos();
        b.call(567890);
        b.getNetwork();
    }
}
