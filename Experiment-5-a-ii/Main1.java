// heirarchial Inheritance
class A {
    int a;


    A() {
        a = 0;
    }


    A(int a) {
        this.a = a;
    }


    void printA() {
        System.out.println("This is class A, a=" + a);
    }
}

class B extends A {
    int b;


    B() {
        super(); 
        b = 0;
    }


    B(int b) {
        super();
        this.b = b;
    }


    void printB() {
        System.out.println("This is class B, b=" + b);
    }
}

class C extends A {
    int c;


    C() {
        super();
        c = 0;
    }


    C(int c) {
        super(); 
        this.c = c;
    }


    void printC() {
        System.out.println("This is class C, c=" + c);
    }
}

public class Main1 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B(1);
        C c = new C(2);
        
        System.out.println("Calling C method using Object of C");
        c.printC();

	System.out.println("Calling A method using Object of C");
        c.printA();
        
        System.out.println("Calling B method using Object of B");
        b.printB();

	System.out.println("Calling A method using Object of B");
        b.printA();
    }
}