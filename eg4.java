/*
class mdm
{
private int num;
public void setNum(int num)
{
this.num=num;
System.out.println("produced : "+this.num);
}
public int getNum()
{
System.out.println("consuming : "+this.num);
return this.num;
}
}
class Producer extends Thread
{
private mdm medium;
Producer(mdm medium)
{
this.medium=medium;
start();
}
public void run()
{
for(int i=201;i<=250;i++)
{
this.medium.setNum(i);
}
}
}
class Consumer extends Thread
{
private mdm medium;
Consumer(mdm medium)
{
this.medium=medium;
start();
}
public void run()
{
int x,y;
for(x=1;x<=50;x++)
{
y=this.medium.getNum();
}
}
}
class eg4
{
public static void main(String gg[])
{
mdm medium=new mdm();
Producer p=new Producer(medium);
Consumer c=new Consumer(medium);
}
}
*/

//solution for above problem

class mdm
{
private int num=0;
private boolean b=false; 
synchronized public void setNum(int num)
{
if(b==true)
{
try
{
wait();
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
this.num=num;
System.out.println("Producer : "+num);
b=true;
notify();
}
synchronized public int getNum()
{
if(b==false)
{
try
{
wait();
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
System.out.println("Consumed : "+num);
b=false;
notify();
return num;
}
}
class Producer extends Thread
{
private mdm medium;
Producer(mdm medium)
{
this.medium=medium;
start();
}
public void run()
{
for(int i=201;i<=250;i++)
{
this.medium.setNum(i);
}
}
}
class Consumer extends Thread
{
private mdm medium;
Consumer(mdm medium)
{
this.medium=medium;
start();
}
public void run()
{
int x,y;
for(x=1;x<=50;x++)
{
y=this.medium.getNum();
}
}
}
class eg4
{
public static void main(String gg[])
{
mdm medium=new mdm();
Producer p=new Producer(medium);
Consumer c=new Consumer(medium);
}
}
