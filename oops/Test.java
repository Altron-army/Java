package oops;

public class Test {
    int a;
    String b;
    public Test(int a, String b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        System.out.println("checkong");
        return a;
    }
    public String getB() {
        return b;
    }
    
    
}
public class ChildTest extends Test
{
int c;
int d;
public ChildTest(int a, String b, int c, int d) {
    super(a, b);
    this.c = c;
    this.d = d;
}

    
}
