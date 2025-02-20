//Abstract class

abstract class A {
    int a;

    A() {
        a=0;
    }

    A(int a) {
        this.a = a;
    }

    abstract void Print();
}

class B extends A {
    int b;

    B() {
        super();
        b=0;
    }

    B(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    void Print() {
        System.out.println("A=" + super.a + ", B=" + b);
    }
}

class C extends A {
    int c;

    C() {
        super();
        c = 0;
    }

    C(int a, int c) {
        super(a);
        this.c = c;
    }

    @Override
    void Print() {
        System.out.println("A=" + super.a + ", C=" + c);
    }
}

class Main2 {
    public static void main(String[] args) {
        A a = new B(12, 23);
        A b = new C(33, 45);
        
        a.Print();
        b.Print();
    }
}