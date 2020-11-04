public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray(5);
  System.out.println(Mega.add("Dragons"));
  System.out.println(Mega.add("Live"));
  System.out.println(Mega.add("Caves"));
  System.out.println(Mega.add("Far From"));
  System.out.println(Mega.add("The Castles."));
  System.out.println(Mega.size());
  System.out.println(Mega.toString());
  //System.out.println(Mega.contains("Live"));
  //System.out.println(Mega.contains("The Castles."));
  //System.out.println(Mega.contains("Far"));
  //System.out.println(Mega.contains("Invisible Man"));
  Mega.add(2,"In The");
  System.out.println(Mega.toString());
  System.out.println(Mega.size());
}
}
