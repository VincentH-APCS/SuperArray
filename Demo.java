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
  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray per = new SuperArray();
    int longer = 0;
    if(a.size() > b.size()){
      longer = a.size();
    }
    else longer = b.size();
    for(int i = 0; i < longer; i++){
      if(a.get(i) != null){
        per.add(a.get(i));
      }
      if(b.get(i) != null){
        per.add(b.get(i));
      }
    }
    return per;
  }

  public static void main(String[] args){
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray letters = new SuperArray();
    letters.add("dino"); letters.add("rode"); letters.add("semi-");
    letters.add("up"); letters.add("giant"); letters.add("on");
    SuperArray letterz = new SuperArray();
    letterz.add("saur"); letterz.add("the"); letterz.add("truck");
    letterz.add("the"); letterz.add("hill"); letterz.add("Friday");

    System.out.println(letters);
    System.out.println(letterz);
    System.out.println(letters.size());
    System.out.println(letterz.size());
    System.out.println(zip(letters, letterz));
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

  }
}
