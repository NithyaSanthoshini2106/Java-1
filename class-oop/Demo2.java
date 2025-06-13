class Account {

    private int acc_Id;
    private String acc_Name;
    public void set_Acc_Id(int aid){
        this.acc_Id=aid;
    }
    public int get_Acc_Id(){
        return this.acc_Id;
    }

    
}
public class Demo2 {
    public static void main(String[] args) {
       Account a1=new Account();  

       System.out.println(a1);
    }

}
