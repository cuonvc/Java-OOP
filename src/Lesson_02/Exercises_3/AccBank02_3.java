public class AccBank02_3 {
    public static void main(String[] args) {
        //tạo tài khoản với constructor 0 tham số (default constructor)
        AccBankSP02_3 acc = new AccBankSP02_3();
        //tạo tài khoản với constructor 1 tham số
        AccBankSP02_3 acc1 = new AccBankSP02_3("45010005054312");
        //tạo tài khoản với constructor 2 tham số
        AccBankSP02_3 acc2 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường");
        //tạo tài khoản với constructor 3 tham số
        AccBankSP02_3 acc3 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường", "Tiết kiệm");
        //tạo tài khoản với constructor 4 tham số
        AccBankSP02_3 acc4 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường",
                "Tiết kiệm", 100000000f);
        //tạo tài khoản với constructor 5 tham số
        AccBankSP02_3 acc5 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường",
                "Tiết kiệm", 100000000f, "BIDV");
        //tạo tài khoản với constructor 6 tham số
        AccBankSP02_3 acc6 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường",
                "Tiết kiệm", 100000000f, "BIDV", "20/5/2020");
        //tạo tài khoản với constructor 7 tham số
        AccBankSP02_3 acc7 = new AccBankSP02_3("45010005054312", "Nguyễn Văn Cường",
                "Tiết kiệm", 100000000f, "BIDV", "20/5/2020", "20/5/2026");
    }
}
