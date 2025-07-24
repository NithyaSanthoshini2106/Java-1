class parent {

    parent(){
        System.out.println("parent class method");

    }
}
class child extends parent{
    child(){
       
        System.err.println("child class method");
    }
}
class Demodemo{
    public static void main(String[] args) {

        child m=new child();
        System.out.println(m);
    }
}