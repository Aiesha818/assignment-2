interface shape
{
public abstract void display();
}
class circle implements shape
{
public void display()
{
System.out.println("circle");
}
}
class square implements shape
{
public void display()
{
System.out.println("square");
}
}
class rectangle implements shape
{
public void display()
{
System.out.println("rectangle");
}
}
class Idemo1
{
public static void main(String a[])
{
shape s1=new circle();
shape s2=new square();
shape s3=new rectangle();
s1.display();
s2.display();
s3.display();
}
}
interface i1
{
}
interface i2
{
}
interface i3
{
}
interface i4 extends i1,i2,i3
{
}
class c1
{
}
class c2
{
}
class c3
{
}
class c4 extends c3
{
}