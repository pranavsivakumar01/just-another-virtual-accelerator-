

class Constructor {

    // default constructor
    public Constructor() {
        System.out.print("This is my constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
		Constructor obj = new Constructor(); // Constructor gets called
    }
}
