class A {
    int a;
    
    A() {
        a = 0;
    }
    
    A(int a) {
        this.a = a;
    }
    
    void print() {
        System.out.println("a=" + a);
    }
}

class B extends A {
    int b;
    
    B() {
        super();
        b = 0;
    }
    
    B(int a, int b) {
        super(a);
        this.b = b;
    }
    
    void print() {
        super.print();
        System.out.println("b=" + b);
    }
}

class C extends B {
    int c;
    
    C() {
        super();
        c = 0;
    }
    
    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    
    void print() {
        super.print();
        System.out.println("c=" + c);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A(1);
        B b = new B(2, 3);
        C c = new C(4, 5, 6);
        
        System.out.println("Calling Print of Class A");
        a.print();
        
        System.out.println("Calling Print of Class B");
        b.print();
        
        System.out.println("Calling Print of Class C");
        c.print();
    }
}