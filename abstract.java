abstract class shape
{
int length,breadth,radius,side;
Scanner input=new Scanner(System.in);
abstract void printArea();
}
class circle extends shape
{
void printArea()
{
System.out.println("\nfinding the area of circle");
System.out.println("enter radius:");
radius=input.nextint();
System.out.println("the area of circle:"+3.14f*radius*radius);
}
}
class square extends shape
{
void printArea()
{
System.out.println("finding the area of square");
System.out.println("enter side:");
side=input.nextint();
System.out.println("The area of square:"+side*side);
}
}
class rectangle extends shape
{
void printArea()
{
System.out.println("finding the area of rectangle");
System.out.println("enter length and breadth:");
length=input.nextint();
breadth=input.nextint();
System.out.println("The area of rectangle is:"+length*breadth);
}
}
class Abstract
{
public static void main(String[]args)
{
circle cir=new circle();
cir.printArea();
square squ=new square();
squ.printArea();
rectangle rec=new rectangle();
rec.printArea();
}
}
