class Account {
    String acc_Name;
    String acc_Email;
}

class SA extends Account {
    int acc_id;
    double acc_Bal;

    SA(int id, String name, String email, double bal) {
        acc_id = id;
        acc_Name = name;
        acc_Email = email;
        acc_Bal = bal;
    }

    
}

public class Demokittu0 {
    public static void main(String[] args) {
        SA sa1 = new SA(101, "nithya", "nithya@gmail.com", 55000.0);
        SA sa2 = new SA(102, "spoorthi", "spoorthi@gmail.com", 23340.0);

        System.out.println(sa1.acc_id);
        System.out.println(sa1.acc_Name);
        System.out.println(sa1.acc_Email);
        System.out.println(sa1.acc_Bal);
    }
}
