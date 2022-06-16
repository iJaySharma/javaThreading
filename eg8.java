class eg8
{
public static void main(String gg[])
{
Thread t;
t=new Thread(()->{
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
});
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