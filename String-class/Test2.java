class Test2 {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        Test2 t1=new Test2();
        Test2 t2=new Test2();
        String s1=new String("Nithya");
        String s2="nithya";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(t1.equals(t2));
        System.out.println(t1 == t2);
        
    }
}