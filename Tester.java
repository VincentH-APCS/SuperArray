//import java.util.Arrays;
public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray();
   System.out.println(Mega.add("Once"));
   System.out.println(Mega.add("Upon"));
   System.out.println(Mega.add("A"));
   System.out.println(Mega.add("Time"));
   System.out.println(Mega.add("takeout-success"));
   System.out.println(Mega.get(0));
   System.out.println(Mega.get(1));
   System.out.println(Mega.get(2));
   System.out.println(Mega.get(3));
   System.out.println(Mega.set(4, ", there"));
   System.out.println(Mega.get(4));
   System.out.println(Mega.size());
 }
}
