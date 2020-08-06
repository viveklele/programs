class constructor1{
int num = 2;
String str = "Hello World";
void display()
{
System.out.println(num+" "+str);
}
public static void main(String[] args)
{
constructor1 num = new constructor1();
constructor1 str = new constructor1();
num.display();
str.display();
}

}