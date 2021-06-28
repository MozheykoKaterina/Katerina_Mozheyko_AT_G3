package main.java.tasks.week4.classWork.object;

public class B {

    public static void main(String[] args) {
        C с = new C();
        с.foo(8);

        A a2 = new A() {
            public int foo(int x) {
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }
        };
        a2.foo(5);
    }
}
