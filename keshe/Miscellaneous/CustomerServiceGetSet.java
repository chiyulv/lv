package Miscellaneous;

public class CustomerServiceGetSet {
        private String SPID;//客户服务员编号
        private String SPname;//客户服务员姓名
        private String SPsex;//客户服务员性别
        private String SPphone;//客户服务员电话
        private String SPpassword;//客户服务员密码
        public CustomerServiceGetSet() { }

        public CustomerServiceGetSet(String SPID, String SPname, String SPsex, String SPphone,String SPpassword) {
            this.SPID = SPID;
            this.SPname = SPname;
            this.SPsex = SPsex;
            this.SPphone = SPphone;
            this.SPpassword = SPpassword;
        }

        public CustomerServiceGetSet(String SPID,String SPpassword){
            this.SPID = SPID;
            this.SPpassword = SPpassword;
        }

        public CustomerServiceGetSet(String text){this.SPID=text;}

        public String getSPID() {
            return SPID;
        }

        public void setSPID(String SPID) {
            this.SPID = SPID;
        }

        public String getSPname() {
            return SPname;
        }

        public void setSPname(String SPname) {
            this.SPname = SPname;
        }

        public String getSPsex() {
            return SPsex;
        }

        public void setSPsex(String SPsex) {
            this.SPsex = SPsex;
        }

        public String getSPphone() {
            return SPphone;
        }

        public void setSPphone(String SPphone) {
            this.SPphone = SPphone;
        }
        public String getSPpassword() {
            return SPpassword;
        }

        public void setSPpassword(String SPpassword) {
            this.SPpassword = SPpassword;
        }
    public static void main(String[] args) {
        Miscellaneous.CustomerServiceGetSet newcustomerservice=new Miscellaneous.CustomerServiceGetSet();

    }
    }

