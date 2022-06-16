class cmn
{
private String something;
public void sam(String something)//synchronized method-->
{
this.something=something;
System.out.printf("I have kept %s,now i am tired and i am going to sleep\n",this.something);
try
{
Thread.sleep(100);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
System.out.printf("Now i am awake, I am picking what i kept %s\n",this.something);
}
}
class Worker extends Thread
{
private String something;
private cmn someplace;
Worker(cmn someplace,String something)
{
this.someplace=someplace;
this.something=something;
start();
}
public void run()
{
synchronized(this.someplace)
{
this.someplace.sam(this.something);
}
}
}

class eg3
{
public static void main(String gg[])
{
cmn commonPlace=new cmn();
Worker w1=new Worker(commonPlace,"Gold");
Worker w2=new Worker(commonPlace,"Silver");
Worker w3=new Worker(commonPlace,"Diamond");
}
}