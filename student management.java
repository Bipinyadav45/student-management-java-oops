import java.util.Scanner;
class Student {
    String name;
    String rollnumber;
    int year;
    String emailid;
    String phonenumber;
    Student(String a, String b, int c, String d, String e) {
        this.name = a;
        this.rollnumber = b;
        this.year = c;
        this.emailid = d;
        this.phonenumber = e;
    }
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Roll Number : " + rollnumber);
        System.out.println("Year : " + year);
        System.out.println("Student Email ID : " + emailid);
        System.out.println("Student Phone Number : " + phonenumber);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = S.nextLine();
        System.out.print("Enter Roll Number: ");
        String b = S.nextLine();
        System.out.print("Enter Year: ");
        int c = S.nextInt();
        S.nextLine(); 
        System.out.print("Enter Email ID: ");
        String d = S.nextLine();
        System.out.print("Enter Phone Number: ");
        String e = S.nextLine();
        Student st = new Student(a, b, c, d, e);
        System.out.println("Student Details: ");
        st.display();
    }
}