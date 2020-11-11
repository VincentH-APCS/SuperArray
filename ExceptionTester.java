public class ExceptionTester{
 public static void main(String[] args){
   try{
     SuperArray Crasher = new SuperArray(-3);
   } catch(
     IllegalArgumentException e){
       System.out.println("We've done a crash!");
     }
  SuperArray Mega = new SuperArray();
     System.out.println(Mega.add("Dragons"));
     System.out.println(Mega.add("danger"));
     System.out.println(Mega.add("The"));
     System.out.println(Mega.add("Magic"));
     System.out.println(Mega.add("random"));
    System.out.println(Mega.size());

  try{
    Mega.add(-5, "error");
  } catch(
    IndexOutOfBoundsException e){
      System.out.println("No Negatives!");
    }
    try{
      Mega.add(555, "elephant");
    } catch(
      IndexOutOfBoundsException e){
        System.out.println("TOO BIG!");
      }
      try{
        Mega.add(5, "samesies");
      } catch(
        IndexOutOfBoundsException e){
          System.out.println("There can only be one");
        }
     try{
          Mega.add(4, "No Problemo?");
        } catch(
          IndexOutOfBoundsException e){
            System.out.println("Oh no");
          }
      System.out.println(Mega);
   }
  }
