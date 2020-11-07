public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public int size(){
    int total = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] != null){
        total = total + 1;
      }
    }
    return total;
  }
  public boolean add(String element){
    int check = 0;
    if(size == data.length){
      resize();
    }
    for(int i = 0; i < data.length; i++){
      if(data[i] == null){
       data[i] = element;
        i = data.length;
        check = 1;
      }
    }
    size = size + 1;
    return (check == 1);
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String old = data[index];
    data[index] = element;
    return old;
  }
  private void resize(){
  String[] nexus = new String[data.length + 10];
  for(int i = 0; i < data.length; i++){
    nexus[i] = data[i];
  }
  data = nexus;
}
  public void clear(){
    String[] voider = new String[data.length];
    data = voider;
    size = 0;
  }
  public boolean isEmpty(){
    return (size == 0);
  }
  public String toString(){
    String bigOne = "[";
    for(int i = 0; i < data.length - 1; i++){
      if(data[i] != null){
        bigOne = bigOne + data[i];
      }
      if(data[i + 1] != null){
        bigOne = bigOne + ",";
      }
    }
    if(data[data.length - 1] == null){
    return bigOne +  "]";
  }
  else {
    return bigOne + data[data.length - 1] + "]";
  }
}
  public boolean contains(String s){
    for(int i = 0; i < data.length; i++){
      if(data[i] != null && data[i].equals(s)){
        return true;
      }
    }
  return false;
  }
  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
  }
  public void add(int index, String element){
    size = size + 1;
    if(size > data.length){
      resize();
    }
    String[] newone = new String[data.length + 1];
    for(int i = 0; i < index; i++){
      newone[i] = data[i];
    }
    newone[index] = element;
    for(int j = index + 1; j < newone.length; j++){
      newone[j] = data[j - 1];
    }
    data = newone;
}
public String remove(int index){
  size = size - 1;
  String gone = data[index];
  for(int i = index; i < size; i++){
    data[i] = data[i - 1];
  }
  return gone;
}
public int indexOf(String s){
  int waldo = -1;
  for(int i = 0; i < data.length; i++){
    if(data[i] != null && data[i].equals(s)){
      waldo = i;
      i = data.length;
    }
  }
  return waldo;
}
public String[] toArray(){
  String[] post = new String[size];
  for(int i = 0; i < size; i++){
    post[i] = data[i];
  }
  return post;
}
public String[] getData(){
  return data;
}
/*public static void removeDuplicates(SuperArray s){
  for(int i = 0; i < s.size(); i++){
    if(s.indexOf(s.get(i)) == i){
      i = i;
    }
    else{
      s.remove(i);
      i = i - 1;
    }
  }
}*/
}
