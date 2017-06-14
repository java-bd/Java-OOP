class ReferencePreservation {

    public static void main(String[] args) {
        B b = new B();
        b.x = 10;
        System.out.println("Before method call b.x " + b.x);

        A a = new A();
        a.method(b);

        System.out.println("After method call b.x " + b.x);

    }
}

class B {

    int x;
}

class A {

    public void method(B obj) {
        System.out.println("Inside method call before modification obj.x " + obj.x);
        obj.x = 300;
        System.out.println("Inside method call before modification obj.x " + obj.x);
        obj = null;
        System.out.println("After putting null obj " + obj);
    }
}
