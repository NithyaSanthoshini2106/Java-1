class Account {
    String acc_Name;
    String acc_Email;

    
    Account(String acc_Name, String acc_Email) {
        this.acc_Name = acc_Name;
        this.acc_Email = acc_Email;
    }
}

class SA extends Account {
    int acc_id;
    double acc_Bal;
    static double min_Bal = 500.00;

    
    SA(int acc_id, String acc_Name, String acc_Email, double acc_Bal) {
        super(acc_Name, acc_Email); 
        this.acc_id = acc_id;
        this.acc_Bal = acc_Bal;
    }

    
}

public class Demokittu1 {
    public static void main(String[] args) {
        SA sa1 = new SA(101, "nithya", "nithya@gmail.com", 55000.00);
        SA sa2 = new SA(102, "spoorthi", "spoorthi@gmail.com", 23340.00);

        

        System.out.println("Accessing from main:");
        System.out.println( sa1.acc_id);
        System.out.println(sa1.acc_Bal);
    }
}
