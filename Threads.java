class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println(i+"\t");
		}
	}
}
class Threads
{
	public static void main(String args[])
	{
		MyThread obj = new MyThread ();
		Thread t = new Thread(obj);
		t.start();
	}
}