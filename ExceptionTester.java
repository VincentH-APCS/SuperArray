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
    Mega.set(-5, "error");
  } catch(
    IndexOutOfBoundsException e){
      System.out.println("No Negatives!");
    }
    try{
      Mega.set(555, "elephant");
    } catch(
      IndexOutOfBoundsException e){
        System.out.println("TOO BIG!");
      }
      try{
        Mega.set(5, "samesies");
      } catch(
        IndexOutOfBoundsException e){
          System.out.println("There can only be one");
        }
     try{
          Mega.set(4, "No Problemo?");
        } catch(
          IndexOutOfBoundsException e){
            System.out.println("Oh no");
          }
   }
  }
