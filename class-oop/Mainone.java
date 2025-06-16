class Employee {
    private int eid;
    private String ename;

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEid() {
        return this.eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return this.ename;
    }
}

public class Mainone {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setEid(101);
        e1.setEname("Nithu");

        e2.setEid(102);
        e2.setEname("Raju");

        System.out.println( e1.getEname());
        System.out.println( e2.getEname());
    }
}
