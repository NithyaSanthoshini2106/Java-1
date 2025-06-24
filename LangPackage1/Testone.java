class Testone {

    public static void main(String[] args) {
        Testone t1=new Testone();
        Testone t2=new Testone();
        System.out.println(t1.toString());
        System.out.println(t1);
        System.out.println(t1.equals(t1));
        System.err.println(t1==t2);
    }
}