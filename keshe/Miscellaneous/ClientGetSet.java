package Miscellaneous;

public class ClientGetSet {
    private String SID;
    private String Sname;
    private String Ssex;
    private String Sphone;
    private String Saddress;
    private String Spassword;

    public ClientGetSet(){}

    public ClientGetSet(String SID,String Sname,String Ssex,String Sphone,String Saddress,String Spassword)
    { this.SID=SID;
    this.Sname=Sname;
    this.Ssex=Ssex;
    this.Sphone=Sphone;
    this.Saddress=Saddress;
    this.Spassword=Spassword;
    }

    public ClientGetSet(String SID,String Spassword){
        this.SID=SID;
        this.Spassword=Spassword;
    }

    public ClientGetSet(String text){this.SID=text;}

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String Ssex) {
        this.Ssex = Ssex;
    }

    public String getSphone() {
        return Sphone;
    }

    public void setSphone(String sphone) {
        this.Sphone =Sphone;
    }

    public String getSaddress() {
        return Saddress;
    }

    public void setSaddress(String saddress) {
        this.Saddress = Saddress;
    }

    public String getSpassword() {
        return Spassword;
    }

    public void setSpassword(String spassword) {
        Spassword = spassword;
    }

}
