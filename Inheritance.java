class base{
    int x;
    base()
    {
        System.out.println("I am a constructor");
    }
    base(int x)
    {
        this.x = x;
    }
    int print(){
        return x;
    }
}

class Derived extends base{
    int y;
    Derived(int a, int b)
    {
        super(b);
        y = a;
    }
    int area()
    {
        return x*y;
    }
}

abstract class parent{
    abstract public void greet();
}

interface Bicycle{
    // All methods are abstract
    void applyBreak(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    public void applyBreak(int decrement){
        System.out.println("Decreasing speed!");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing speed!");
    }
}

class child extends parent{
    public void greet()
    {
        System.out.println("Hello");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived b = new Derived(3, 4);
        System.out.println(b.print());
        child c = new child();
        c.greet();
        AvonCycle A = new AvonCycle();
        A.applyBreak(20);
    }
}
