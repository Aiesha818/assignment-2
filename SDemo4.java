class student
{
private int regno;
private String name;
student(int regno,String name)
{
this.regno=regno;
this.name=name;
}
public void display()
{
System.out.println("Registration no:"+regno);
System.out.println("Name:"+name);
}
}
class SDemo4
{
public static void main(String a[])
{
student s1=new student(205,"pranu");
student s2=new student(215,"ishu");
s1.display();s2.display();
}
}


