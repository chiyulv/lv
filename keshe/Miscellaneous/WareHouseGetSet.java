package Miscellaneous;

public class WareHouseGetSet {
        private String Wno;//仓库号
        private String Wkeeper;//仓库管理员
        private String Wkphone;//仓库管理员电话
        private String Wfullsave;//仓库容量

        public WareHouseGetSet() {
        }

        public WareHouseGetSet(String Wno, String Wkeeper, String Wkphone, String Wfullsave) {
            this.Wno = Wno;
            this.Wkeeper = Wkeeper;
            this.Wkphone = Wkphone;
            this.Wfullsave = Wfullsave;
        }

    public WareHouseGetSet(String text){this.Wno=text;}

        public String getWno() {
            return Wno;
        }

        public void setWno(String wno) {
            this.Wno = Wno;
        }

        public String getWkeeper() {
            return Wkeeper;
        }

        public void setWkeeper(String wkeeper) {
            this.Wkeeper = Wkeeper;
        }

        public String getWkphone() {
            return Wkphone;
        }

        public void setWkphone(String wkphone) {
            this.Wkphone = Wkphone;
        }

        public String getWfullsave() {
            return Wfullsave;
        }

        public void setWfullsave(double wfullsave) {
            this.Wfullsave = Wfullsave;
        }
}
