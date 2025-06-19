class Account{

    String acc_Name;
    String acc_Email;
    Account(String name,String email){
        this.acc_Name=name;
        this.acc_Email=email;
    }

 
}
class SA extends Account{
    int acc_Id;
    double acc_Bal;
    static double min_Bal=500.00;
    SA(int id,String name,String email,double amount){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }
   

}
class Demokittu8{

    public static void main(String[] args) {
        SA sa1=new SA(101,"nithya","nithya@gmail.com",55000.00);
        SA sa2=new SA(102,"spoorthi","spoorthi@gmail.com",23340.00);
        SA sa3=new SA(103,"Kiran Raju","kiran raju@gmail.com",4500.00);
        System.out.println(sa3.acc_Id);
        System.out.println(sa3.acc_Name);
        System.out.println(sa3.acc_Email);
        System.out.println(sa3.acc_Bal);
        System.out.println(sa1.acc_Id);
        System.out.println(sa1.acc_Name);
        System.out.println(sa1.acc_Email);
        System.out.println(sa1.acc_Bal);
        System.out.println(sa2.acc_Id);
        System.out.println(sa2.acc_Name);
        System.err.println(sa2.acc_Email);
        System.out.println(sa2.acc_Bal);
        
        
    }
}