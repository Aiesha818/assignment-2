class employee
{
private int eid;
private String ename;
employee(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}
public void display()
{
System.out.println("Registration number:"+eid);
System.out.println("Name is:"+ename);
}
public static void main(String[]args)
{
employee s1=new employee(214,"seefa");
employee s2=new employee(215,"ishu");
s1.display();
s2.display();
}
}
