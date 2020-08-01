public class constructor{
int x;
public constructor(){
x = 10;
System.out.println("x = "+x);
}	
public constructor(int s1){

System.out.println("S1 = "+ s1);
}
public constructor(String s1){

System.out.println("S1 = "+ s1);
}

//public constructor(String s1, int a){

//System.out.println("S1 = "+ s1);
//System.out.println("a = "+ a);
//}

public static void main(String[] args){

constructor MyObj;
constructor con1 = new constructor(12);
MyObj = new constructor();
constructor con2 = new constructor("Vivek");
constructor con3 = new constructor(10 , "Vivek");
//System.out.println(MyObj);
}
}
