import java.awt.*;
class MyFrame extends Frame
{
    public static void main(String[] args)
    {
        MyFrame f1 = new MyFrame();
        f1.setSize(500,200);
        f1.setTitle("GUI World");
        f1.setVisible(true);
        f1.addWindowListener(new MyClass ());
    }
}
class MyClass extends windowAdapter
{
    public void windowClosing (WindowEvent e)
    {
        System.exit(0);
    }
}
