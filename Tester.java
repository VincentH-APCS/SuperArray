//import java.util.Arrays;
public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray();
    if(Mega.add("Once")){
      System.out.println(Mega.get(0));
    }
   if(Mega.add("Upon")){
     System.out.println(Mega.get(1));
   }
   if(Mega.add("A")){
     System.out.println(Mega.get(2));
   }
   if(Mega.add("Time")){
    System.out.println(Mega.get(3));
   }
  System.out.println(Mega.set(3, ", there"));
   System.out.println(Mega.get(3));
   System.out.println(Mega.size());
 }
}
