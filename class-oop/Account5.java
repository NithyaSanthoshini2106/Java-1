public class Account5 {
    int acc_Id;
    String acc_Name;
    int acc_Bal;

    public Account5(int id,String name,int amount){
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }
    public boolean deposit_Amount(int amount){
        this.acc_Bal=this.acc_Bal+amount;
        return true;
    }
    public static void main(String[] args) {
       Account5 a1=new Account5(101,"Nithya Raju",5000);
       Account5 a2=new Account5(102,"Spoorthi Raju",50000);
       Account5 a3=new Account5(103,"dummu raju",2000);

       System.out.println(a1.acc_Name);
       System.out.println(a2.acc_Name);
       a1.deposit_Amount(100);
       a1.deposit_Amount(50);
       a2.deposit_Amount(10);
       a2.deposit_Amount(20);
       
       a3.deposit_Amount(10);
       System.out.println(a1.acc_Bal);
       System.out.println(a2.acc_Bal);
       System.out.println(a3.acc_Bal);
    }
}