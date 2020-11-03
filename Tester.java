//public class Tester{
 //public static void main(String[] args){
  /* SuperArray Mega = new SuperArray();
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
  if(Mega.add("People.")){
    System.out.println(Mega.get(10));
  }
  if(Mega.add("Once")){
    System.out.println(Mega.get(11));
  }
 if(Mega.add("They")){
   System.out.println(Mega.get(12));
 }
 if(Mega.add("Type")){
   System.out.println(Mega.get(13));
 }
 if(Mega.add("It")){
  System.out.println(Mega.get(14));
 }
 if(Mega.add("Into")){
   System.out.println(Mega.get(15));
 }
 if(Mega.add("A")){
  System.out.println(Mega.get(16));
 }
 if(Mega.add("Program")){
  System.out.println(Mega.get(17));
 }
 if(Mega.add("They")){
 System.out.println(Mega.get(18));
 }
 if(Mega.add("Must")){
   System.out.println(Mega.get(19));
 }
if(Mega.add("Dance")){
  System.out.println(Mega.get(20));
}
if(Mega.add("In Their Seat")){
  System.out.println(Mega.get(21));
}
   System.out.println(Mega.size());
 }
}*/
public class Tester {
    public static void main(String[] args) {
        SuperArray words = new SuperArray();
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
        }

        for(int i = 0; i < 10; ++i) {
            words.add("mhm");
        }

        for(int i = 0; i < words.size(); ++i) {
            if(!words.get(i).equals("mhm")) {
                System.out.println("Don't say " + words.set(i, "hmh") + "!");
            }
            System.out.println( words.get(i) );
        }
    }
}
