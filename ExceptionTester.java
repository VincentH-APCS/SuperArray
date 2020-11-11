public class ExceptionTester{
 public static void main(String[] args){
   try{
     SuperArray Crasher = new SuperArray(-3);
   } catch(
     IllegalArgumentException e){
       System.out.println("We've done a crash!");
     }
  SuperArray Mega = new SuperArray();
     Mega.add(0,"Dragons");
     Mega.add(1,"danger");
     Mega.add(2, "The");
     Mega.add(3, "Magic");
     Mega.add(4, "random");
  System.out.println(Mega.size());

  try{
    Mega.get(-5);
  } catch(
    IndexOutOfBoundsException e){
      System.out.println("No Negatives!");
    }
    try{
      Mega.get(555);
    } catch(
      IndexOutOfBoundsException e){
        System.out.println("TOO BIG!");
      }
      try{
        Mega.get(2);
      } catch(
        IndexOutOfBoundsException e){
          System.out.println("Check code buddy");
        }
    System.out.println(Mega.get(2));
   }
  }
