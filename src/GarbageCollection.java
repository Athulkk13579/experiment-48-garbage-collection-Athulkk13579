class Garbage {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

public class Main {
    public static void main(String[] args) {
        Garbage g = new Garbage();
        g = null;
        System.gc();
    }
}
