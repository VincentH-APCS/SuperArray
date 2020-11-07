public class Demo{
  public static void removeDuplicates(SuperArray s){
   for(int i = s.size(); i > 0; i--){
      if(s.indexOf(s.get(i)) < i){
         s.remove(i);
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray likes = new SuperArray();
    for(int i = 0; i < a.size(); i++){
      if(likes.contains(a.get(i))){
        likes = likes;
      }
      else{
        if(b.contains(a.get(i))){
          likes.add(a.get(i));
        }
      }
    }
    return likes;
  }

  public static void main(String[] args){
    SuperArray words = new SuperArray();
    words.add("kani");  words.add("uni"); words.add("ebi");
    words.add("una"); words.add("una"); words.add("ebi");
    words.add("another"); words.add("uni"); words.add("numb");
    /*words.add("kani"); words.add("una"); words.add("una");
    words.add("ebi"); words.add("toro");
    words.add("ebi"); words.add("toro");*/
    SuperArray letters = new SuperArray();
    letters.add("dino"); letters.add("four"); letters.add("uni");
    letters.add("kani"); letters.add("uni"); letters.add("test");
    SuperArray letterz = new SuperArray();
    letterz.add("dino"); letterz.add("four"); letterz.add("uni");
    letterz.add("kani"); letterz.add("uni"); letterz.add("test");

    System.out.println(words);
    System.out.println(letters);
    System.out.println(letterz);
    System.out.println(words.size());
    System.out.println(words.size());
    System.out.println(letters.size());

    System.out.println(words.equals(letters));
    System.out.println(words.equals(letterz));
    System.out.println(letters.equals(letterz));
    System.out.println(letterz.equals(letters));
  }
}
