public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray();
  System.out.println(Mega.add("Dragons"));
  System.out.println(Mega.get(0));
  System.out.println(Mega.size());
  System.out.println(Mega.isEmpty());
  Mega.clear();
  System.out.println(Mega.size());
  System.out.println(Mega.isEmpty());
}
}
