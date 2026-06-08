class Student
{
    int  rollNo = 101;
    String name = "John Doe";
    void display()
    {
        System.out.println("Student Roll no is:"+rollNo);
        System.out.println("Student Name is:"+name);
    }
}
class StudentDemo2
{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("First student details:");
        s1.display();
        Student s2 = new Student();
        System.out.println("Second student details:");
        s2.display();
    }
}