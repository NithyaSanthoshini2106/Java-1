interface A {
    default void show() {
        System.out.println("Interface A: show()");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B: show()");
    }
}

class fourkittu implements A, B {

    // Resolving the conflict by overriding show()
    @Override
    public void show() {
        A.super.show(); // calling Interface A's show()
        B.super.show(); // calling Interface B's show()
        System.out.println("fourkittu: combined show()");
    }

    public static void main(String[] args) {
        fourkittu obj = new fourkittu();
        obj.show();
    }
}
