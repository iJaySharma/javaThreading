class aaa extends Thread 
{
aaa()
{
start();
}
public void run()
{
for(int j=5001;j<=5021;j++)
{
System.out.print(j+" ");
try
{
Thread.sleep(250);
}catch(InterruptedException ie)
{
System.out.print(ie);
}
}
}
}
class eg1
{
public static void main(String gg[])
{
aaa a = new aaa();
for(int i=201;i<=211;i++)
{
System.out.print(i+" ");
try
{
Thread.sleep(250);
}catch(InterruptedException ie)
{
System.out.print(ie);
}
}
}
}