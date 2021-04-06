class count extends Exception
{
private int count;
count(int c)
{
this.count=count;
}
void display()
{
System.out.println("invalid count:"+count);
}
}
class Exception
{
public static void main(String args[])
{
int count=0;
int sum=0;
for(int i=0;i<args.length;i++)
{
count++;
sum=sum+Integer.parseInt(args[i]);
}
try{
if(count<3)
throw new count(c);
{
System.out.println("valid count:"+count);
}
}catch(count me)
{
me.display();
}
finally
{
System.out.println("program-end");
}
}
}
