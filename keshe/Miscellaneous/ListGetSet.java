package Miscellaneous;

public class ListGetSet {
    private String List;
        private String Fno;
        private String Fname;
        private String Lcount;
        private String Ltprice;
        private String Ldmethod;
        private String SID;
        private String Sname;

    public ListGetSet(){}
    public ListGetSet(String List,String Fno,String Fname,String Lcount,String Ltprice,String Ldmethod,String SID,String Sname){
        this.List=List;
        this.Fno=Fno;
        this.Fname=Fname;
        this.Lcount=Lcount;
        this.Ltprice=Ltprice;
        this.Ldmethod=Ldmethod;
        this.SID=SID;
        this.Sname=Sname;
    }

    public ListGetSet(String List,String Lcount,String Ltprice,String Ldmethod){
        this.List=List;
        this.Lcount=Lcount;
        this.Ltprice=Ltprice;
        this.Ldmethod=Ldmethod;
    }

    public ListGetSet(String List,String Fno,String Fname,String Lcount,String Ltprice,String Ldmetod){
        this.List=List;
        this.Fno=Fno;
        this.Fname=Fname;
        this.Lcount=Lcount;
        this.Ltprice=Ltprice;
        this.Ldmethod=Ldmetod;
    }
    public ListGetSet(String text){this.List=text;}

    public String getList() {
        return List;
    }

    public void setList(String list) {
        List = list;
    }

    public String getFno() {
        return Fno;
    }

    public void setFno(String fno) {
        Fno = fno;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLcount() {
        return Lcount;
    }

    public void setLcount(String lcount) {
        Lcount = lcount;
    }

    public String getLtprice() {
        return Ltprice;
    }

    public void setLtprice(String ltprice) {
        Ltprice = ltprice;
    }

    public String getLdmethod() {
        return Ldmethod;
    }

    public void setLdmethod(String ldmethod) {
        Ldmethod = ldmethod;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }
    }


