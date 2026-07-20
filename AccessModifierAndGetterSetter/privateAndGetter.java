package AccessModifierAndGetterSetter;

public class privateAndGetter {
    public static void main(String[] args) {
    BankAccount ba = new BankAccount();
    ba.deposit(500);
    ba.withdraw(200);
        System.out.println("The remaining balance in your account is : "+ba.getBalance());


    Student s1 = new Student("Hitesh",23,34,"NIT SRINAGAR");
        System.out.println(s1.getAge());
        s1.setAge(36);
        System.out.println(s1.getAge());
    }
}
class BankAccount{
    private double balance ;
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw( int amount){
    balance -= amount;

    }
    public double getBalance(){
        return balance;
    }
}


class Student{
    private String name;
    private int rollNo;
    private int age;
    private String college;



    Student(String name, int rollNo,int age,String college){
        this.name = name;
        this.rollNo = rollNo;
        this.age= age;
        this.college = college;
    }




    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name= name;
    }
    public int getRollNo(){
        return rollNo;

    }
    public void setRollNo( int rollNo) {
        this.rollNo = rollNo;

    }
    public int getAge(){
        return age;

    }
    public void setAge( int age){
        this.age= age;
    }
    public String getCollege(){
        return college;

    }
    public void setCollege(String college){
        this.college= college;
    }
}
