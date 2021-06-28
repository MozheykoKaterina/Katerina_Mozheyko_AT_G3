package main.java.tasks.week4.classWork.object;

public class C extends A{

    public int foo(int x) {
        int y = super.foo(x);
        System.out.println(y);
        return y;
    }
}
