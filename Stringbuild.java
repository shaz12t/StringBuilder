import java.util.*;

public class Stringbuild {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("hello");
System.out.println(sb);
// set Char
 
sb.insert(2,'p');
System.out.println(sb);

// delete
sb.delete(0,1);

System.out.println(sb);

// insertntln(sb);

// append
sb.append("l");
System.out.println(sb);


// reverse
for(int i=0;i<sb.length()/2;i++){
    int front =i;
    int back = sb.length()-1-i;
    char frontChar = sb.charAt(front);
    char backChar = sb.charAt(back);

    sb.setCharAt(front,backChar);
    sb.setCharAt(back,frontChar);}
    System.out.println(sb);



}

    }