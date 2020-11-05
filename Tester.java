public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray(5);

  Mega.add(0,"Dragons");
  Mega.add(1,"Live");
  Mega.add(2,"In The");
  Mega.add(3, "Caves");
  Mega.add(4, "Magic--disappear");
  Mega.add(5, "Far From");
  Mega.add(6, "Invisible Ghost");
  Mega.add(6, "The Castles.");
  System.out.println(Mega.size());
  System.out.println(Mega.remove(4));
  System.out.println(Mega.toString());
  System.out.println(Mega.size());
  System.out.println(Mega.indexOf("In The"));
  System.out.println(Mega.indexOf("Invisible Ghost"));
  System.out.println(Mega.indexOf("Far From"));
  System.out.println(Mega.indexOf("Far"));
  System.out.println(Mega.indexOf("Carmen Sandiego"));
  System.out.println(Mega.indexOf("negative 1"));
  System.out.println(Mega.toArray());
  System.out.println(Mega.getData());
}
}
