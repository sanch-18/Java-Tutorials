class Cylinder
{
    private int length;
    private int breadth;

    public Cylinder(int l, int b){
        length = l;
        breadth = b;
    }
    public Cylinder(int a)
    {
        length = a;
        breadth = 1;
    }
    public int area()
    {
        return length*breadth;
    }
}
class student{
    private long id;
    private String name;
    private String Branch;
    private float grade;
    public student(long a, String b, String c, float d)
    {
        this.id = a;
        this.name = b;
        this.Branch = c;
        this.grade = d;
    }
    public void setpara(student x, long a, String b, String c, float d)
    {
        x.id = a;
        x.name = b;
        x.Branch = c;
        x.grade = d;
    }
    public void printdetails()
    {
        System.out.printf("Your name is %s, with id %d, with branch %s, and grade %f\n", name, id, Branch, grade);
    }

}


public class OOPS {
    public static void main(String[] args) {
        student a = new student(2021200089, "Sanchit Patil", "EXTC", 8.24f);
        //a.setpara(a, 2021200089, "Sanchit Patil", "EXTC", 8.24f);
        a.printdetails();
        Cylinder x = new Cylinder(3, 4);
        Cylinder y = new Cylinder(5);
        System.out.println(x.area());
        System.out.println(y.area());
    }
}
