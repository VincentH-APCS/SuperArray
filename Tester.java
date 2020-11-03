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
  //System.out.println(Mega.set(3, ", there"));
   //System.out.println(Mega.get(3));
   if(Mega.add("There")){
     System.out.println(Mega.get(4));
   }
   if(Mega.add("Was")){
    System.out.println(Mega.get(5));
   }
   if(Mega.add("A")){
    System.out.println(Mega.get(6));
   }
   if(Mega.add("Code")){
   System.out.println(Mega.get(7));
   }
   if(Mega.add("That")){
     System.out.println(Mega.get(8));
   }
  if(Mega.add("Haunted")){
    System.out.println(Mega.get(9));
  }
  //Mega.resize();
  if(Mega.add("People")){
    System.out.println(Mega.get(10));
  }
   System.out.println(Mega.size());
 }
}
