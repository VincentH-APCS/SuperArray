public class Tester{
 public static void main(String[] args){
   SuperArray Mega = new SuperArray();

  Mega.add(0,"Dragons");
  Mega.add(1,"danger");
  Mega.add(2, "The");
  Mega.add(3, "Magic");
  Mega.add(4, "random");
  Mega.add(5, "The");
  Mega.add(6, "danger");
  Mega.add(7, "danger");
  Mega.add(8, "danger");
  System.out.println(Mega.toString());
  System.out.println(Mega.size());
  //SuperArray.removeDuplicates(Mega);
  System.out.println(Mega.remove(2));
  System.out.println(Mega.toString());
}
}
