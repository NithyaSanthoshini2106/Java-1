public class Account {
    int acc_Id;
    String acc_Name;
    
    public Account(int id,String name){
        this.acc_Id=id;
        this.acc_Name=name;
    }
    public static void main(String[] args) {
       Account a1=new Account(101,"Nithya Raju");
       Account a2=new Account(102,"Spoorthi Raju");

       System.out.println(a1.acc_Name);
       System.out.println(a2.acc_Name);
    }
}
