//------------- Phase 1 -------------
public class SuperArray {
  private String[] data;
  private int size;
    public SuperArray () {
    data = new String[10];
    }
    public void clear () {
      size = 0;
      }

    public int size() {
      return size;
    }
    public boolean isEmpty(){
      if (size == 0){
        return true;
      }
      else {return false;}
    }
    public boolean add(String elem) {
      if (size == data.length){
        this.resize();
      }
      if (size < data.length){
      for (int i = 0; i < data.length; i ++) {
        if (i == size){
          data[i] = elem;
        }
      }
    }
return true;
    }
    //Got help from Tiffany Cao on toString
    public String toString () {
      String x = "[";
      for(int a = 0; a < size; a++){
      x = x + data[a];
      if(a < size - 1){
        x = x + ", ";
      }
    }return x + "]";
    }

    public String toStringDebug() {
      String y = "";
      for (int z = 0; z < data.length; z++){
        if (z < size){
          y = y + data[z];
        }
        if(z >= size){
       y =  y +"null";
     }
     if(z < data.length-1){
       y = y + ", ";
     }
    }
    return y + "]";
  }
    public String get(int index){
      if (index < 0 || index >= size()){
        return null;
      }
      else { return data [index];}
      }

      private String set(int l, String p){
        if (l < 0 || l >= size()){
          return null;
        }
        return "yeah";
      }
      //------------- Phase 2 -------------

private void resize() {
  String[] x = data;
  if (size <= data.length){
  x = new String[data.length * 2];
  for (int i = 0; i < data.length; i ++){
    x[i] = data[i];
  }
}}













}
