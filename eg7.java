class eg7
{
public static void main(String gg[])
{
Runnable r;
r=()->{
for(int i=501;i<=550;i++)
{
System.out.print(i+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
};
Thread t=new Thread(r);
t.start();
for(int e=201;e<=250;e++)
{
System.out.print(e+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}