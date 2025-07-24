class Account{
   private int acc_Id;
   private String acc_Name;

   public void set_Acc_Id(int aid){
    this.acc_Id=aid;
   }

   public int get_Acc_Id(){
    return this.acc_Id;
   }
   public void set_Acc_Name(String aName){
    this.acc_Name=aName;
   }
   public String get_Acc_Name(){
    return this.acc_Name;
   }
   
}

public class Demo3{
    public static void main(String[] args) {
       Account a1=new Account();  
       a1.set_Acc_Id(101);
       a1.set_Acc_Name("Nithya");
       
       System.out.println(a1.get_Acc_Id());
       System.out.println(a1.get_Acc_Name());
    }
}
