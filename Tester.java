public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray(5);
  //System.out.println(Mega.add("Dragons"));
  //System.out.println(Mega.add("Live"));
  //System.out.println(Mega.add("Caves"));
  //System.out.println(Mega.add("Far From"));
  //System.out.println(Mega.add("The Castles."));
  Mega.add(0,"Dragons");
  Mega.add(1,"Live");
  Mega.add(2,"In The");
  Mega.add(3, "Caves");
  Mega.add(4, "Far From");
  Mega.add(5, "The Castles.");
  System.out.println(Mega.size());
  System.out.println(Mega.toString());
  System.out.println(Mega.add("Invisble Ghost"));
  System.out.println(Mega.add("Magic--disappear"));
  System.out.println(Mega.size());
  System.out.println(Mega.remove(7));
  System.out.println(Mega.toString());
  System.out.println(Mega.size());
}
}
