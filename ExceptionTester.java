public class ExceptionTester{
 public static void main(String[] args){
   try{
     SuperArray Crasher = new SuperArray(-3);
   } catch(
     IllegalArgumentException e){
       System.out.println("We've done a crash!");
     }
   try{
     SuperArray NoCrasher = new SuperArray(5);
   } catch(
     IllegalArgumentException e){
       System.out.println("Oh no check again");
     }
   }
  }
