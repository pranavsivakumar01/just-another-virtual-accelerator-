class Demo {
    public Demo() {
        System.out.print("this a");
    }

    public Demo(int n) {
        System.out.print("this a int");
    }
}

class B extends Demo {
    public B() {
        System.out.print("thi b");
    }

    public B(int n) {
        System.out.print("thi int b");
    }
}

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B obj = new B(5);
    }
}
