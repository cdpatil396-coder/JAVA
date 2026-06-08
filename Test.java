import java.util.Scanner;

class Parent
{
    String parentName;

    void getParentName(String name)
    {
        parentName = name;
    }

}

class Child extends Parent
{
    String childName;

    void getChildName(String name)
    {
        childName = name;
    }

    void display()
    {
		        System.out.println("Parent Name: " + parentName);
				System.out.println("Child Name: " + childName);

	}
}

class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Child obj = new Child();

        System.out.println("Enter Parent Name:");
        String p = sc.nextLine();

        System.out.println("Enter Child Name:");
        String c = sc.nextLine();

        obj.getParentName(p);
        obj.getChildName(c);

        obj.display();
        //obj.showChild();
    }
}