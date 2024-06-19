import java.util.Scanner;

public class Main{
public static void main(String[] arg){


//read input

Scanner qwerty=new Scanner(System.in);

System.out.println("please enter yoour name");
String space= qwerty.nextLine();

    //checking the lenght of the name

int lenght=space.length();
System.out.println("length of the name"+lenght);
System.out.println("please enter your age" );
int age=qwerty.nextInt();

//cheking if the age is odd or even

if (age%2==0) {
    System.out.println(age      +"IS EVEN");

    
}else{
    System.out.println("is odd");
}


System.out.println("please enter marks for your first unit");
int marks=qwerty.nextInt();
System.out.println("please enter marks for your second unit");
int marks2=qwerty.nextInt();
System.out.println("please enter marks for your third unit");
int marks3=qwerty.nextInt();
System.out.println("please enter marks for your fourth unit");
int marks4=qwerty.nextInt();
System.out.println("please enter marks for your fifth unit");
int marks5=qwerty.nextInt();



System.out.println("calculating the average of the units");
int total=(marks+marks2+marks3+marks4+marks5);

// calculate the average

double average = (double) total / 5;
System.out.println("the average is:"+average);
 
//divisibility test

System.out.println("finding the divisibiity test ");
int num=qwerty.nextInt();
int divisor=1;
int divisor1=2;
int divisor2=3;
int divisor3=4;
int divisor4=5;
int divisor5=6;
int divisor6=7;
int divisor7=8;
int divisor8=9;
if(num % divisor == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor);


}


if(num % divisor1 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor1);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor1);


}


if(num % divisor2 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor2);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor2);


}


if(num % divisor3 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor3);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor3);


}


if(num % divisor4 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor4);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor4);


}


if(num % divisor5 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor5);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor5);


}


if(num % divisor6 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor6);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor6);


}


if(num % divisor7 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor7);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor7);


}


if(num % divisor8 == 0){
System.out.println(num+"the number you gave is divisible by"+ divisor8);
}else{
    System.out.println(num+"the number you gave is not divisible by"+ divisor8);


}

//multiples of 2,3,7
int start = 71;
int end = 150;

System.out.println("Multiples of 2, 3, and 7 within the range of 71 to 150:");

for (int i = start; i <= end; i++) {
    if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
        System.out.println(i);
    }
}




//callculator
System.out.println("Enter the first digit");
int firstnumb=qwerty.nextInt();
System.out.println("Enter the second digit");
int secondnumb=qwerty.nextInt();
int addtotal= firstnumb+secondnumb;
int subtotal= firstnumb-secondnumb;
int multtotal= firstnumb*secondnumb;
int divtotal= firstnumb/secondnumb;
System.out.println("the addittion of the two numbers is:"+addtotal);
System.out.println("the addittion of the two numbers is:"+subtotal);
System.out.println("the addittion of the two numbers is:"+multtotal);
System.out.println("the addittion of the two numbers is:"+divtotal);















    }
}