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
}
