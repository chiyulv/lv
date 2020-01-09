package Miscellaneous;

public class FruitGetSet {
    private String Fno;
    private String Fvariety;
    private String Fname;
    private String Fprice;
    private String Fintroduction;
    private String Fstate;
    private String Wno;
    private String Wtime;
    private String Fquantity;

    public FruitGetSet() {}
    public FruitGetSet(String Fno,String Fvariety,String Fname,String Fprice,String Fintroduction,String Fstate,String Wno,String Wtime,String Fquantity){
        this.Fno=Fno;
        this.Fvariety=Fvariety;
        this.Fname=Fname;
        this.Fprice=Fprice;
        this.Fintroduction=Fintroduction;
        this.Fstate=Fstate;
        this.Wno=Wno;
        this.Wtime=Wtime;
        this.Fquantity=Fquantity;
    }

    public FruitGetSet(String Fno,String Fprice,String Fintorduction,String Fstate,String Wno,String Fquantity){
        this.Fno=Fno;
        this.Fprice=Fprice;
        this.Fintroduction=Fintorduction;
        this.Fstate=Fstate;
        this.Wno=Wno;
        this.Fquantity=Fquantity;
    }

    public FruitGetSet(String text){this.Fno=text;}

    public String getFno() {
        return Fno;
    }

    public void setFno(String fno) {
        this.Fno = fno;
    }

    public String getFvariety() {
        return Fvariety;
    }

    public void setFvariety(String fvariety) {
        this.Fvariety = fvariety;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public String getFprice() {
        return Fprice;
    }

    public void setFprice(String fprice) {
        this.Fprice = fprice;
    }

    public String getFintroduction() {
        return Fintroduction;
    }

    public void setFintroduction(String fintroduction) {
        this.Fintroduction = fintroduction;
    }

    public String getFstate() {
        return Fstate;
    }

    public void setFstate(String fstate) {
        this.Fstate = fstate;
    }

    public String getWno() {
        return Wno;
    }

    public void setWno(String wno) {
        this.Wno = wno;
    }

    public String getWtime() {
        return Wtime;
    }

    public void setWtime(String wtime) {
        this.Wtime = wtime;
    }

    public String getFquantity() {
        return Fquantity;
    }

    public void setFquantity(String fquantity) {
        this.Fquantity = fquantity;
    }

    public static void main(String[] args) {
        Miscellaneous.FruitGetSet newfruit=new Miscellaneous.FruitGetSet();

    }
}

