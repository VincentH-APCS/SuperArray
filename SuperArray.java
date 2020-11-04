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
}
