package Miscellaneous;

public class AdminGetSet {

        private String AID;
        private String Wkeeper;
        private String Asex;
        private String Wkphone;
        private String Wpassword;

        public AdminGetSet() {}
        public AdminGetSet(String AID,String Wkeeper,String Asex,String Wkphone,String Wpassword){
            this.AID=AID;
            this.Wkeeper=Wkeeper;
            this.Asex=Asex;
            this.Wkphone=Wkphone;
            this.Wpassword=Wpassword;
        }

        public AdminGetSet(String AID,String Wpassword){
            this.AID=AID;
            this.Wpassword=Wpassword;
        }

        public String getAID() {
            return AID;
        }

        public void setAID(String AID) {
            this.AID = AID;
        }

        public String getWkeeper() {
            return Wkeeper;
        }

        public void setWkeeper(String wkeeper) {
            this.Wkeeper = wkeeper;
        }

        public String getAsex() {
            return Asex;
        }

        public void setAsex(String asex) {
            this.Asex = asex;
        }

        public String getWkphone() {
            return Wkphone;
        }

        public void setWkphone(String wkphone) {
            this.Wkphone = wkphone;
        }

        public String getWpassword() {
            return Wpassword;
        }

        public void setWpassword(String wpassword) {
            this.Wpassword = wpassword;
        }
        public static void main(String[] args) {
            Miscellaneous.AdminGetSet newadmin=new Miscellaneous.AdminGetSet();

        }
    }


