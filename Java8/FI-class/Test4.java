interface Funcation_one {

    public abstract int squreIt(int num);

}
class Test4 implements Funcation_one{

    public int squreIt(int num){
        return num*num;


    }
    public static void main(String[] args) {
        Funcation_one obj=new Test4();
        System.out.println(obj.squreIt(10));
    }
}
