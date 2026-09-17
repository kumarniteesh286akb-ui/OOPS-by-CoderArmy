package Enumerations;

public class Enumeration {
    public static void main(String[] args) {
    String status = PaymentStatus.SUCCESS;
        System.out.println(status);
        int status2 = 100;
        if(status=="Sucess"){
        // String comparision is very slow in this case
        }
    }
}
/*
Problems with this approach :
1.Type safety
2. Poor Readability

 */
class PaymentStatus{
    // This is a class which is constant and finalize
    public static final String SUCCESS = "Success";
        public  static final String  FAILED = "Failed";
            public static final String  PENDING = "Pending";
}
class Role{
    public static final int USER = 1;
            public static final int ADMIN = 2;
            public static final int Manager = 2;
}
