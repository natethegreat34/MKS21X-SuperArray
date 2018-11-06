//------------- Phase 1 -------------
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }
     public SuperArray(int startingCapacity){
       size = 0;
       if (startingCapacity < 0){
         throw new  IllegalArgumentException ("can't be negative");
       }
      else{ data = new String[startingCapacity];}

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
      if (size >= data.length){
        resize();
      }
      data[size] = elem;
      size ++;
      return true;
        }
    //Got help from Tiffany Cao on toString
    public String toString() {
  String s = ("[");
  for (int i = 0; i < size - 1; i++){
    s+=(data[i] + ", ");
  }
  if (size != 0) s+=(data[size - 1]);
  s += "]";
  return s;
}

public String toStringDebug(){
  String s = ("[");
  for (int i = 0; i < data.length - 1; i++){
    s+=(data[i] + ", ");
  }
  if (data.length != 0) {s+=(data[data.length - 1]);}
  s += "]";
  return s;
}
    public String get(int index){
      if (index < 0 || index >= size() || size == 0){
        throw new IndexOutOfBoundsException();
      }
      else { return data [index];}
      }

      public String set(int l, String p){
        if (l < 0 || l >= size()){
          throw new IndexOutOfBoundsException();
        }
        String x = data [l];
        data [l] = p;
        return x;
      }
      //------------- Phase 2 -------------

private void resize() {
  String[] x = new String[data.length * 2 + 1];
  for (int i = 0; i < data.length; i ++){
    x[i] = data[i];
  }
  data = x;
}
//------------- Phase 3 -------------

public boolean contains(String target){
  for (int i = 0; i < size; i ++){
    if (data[i].equals(target)){
    return true;
  }}
  return false;
}

public int indexOf(String element){
  for (int i = 0; i < size; i ++){
    if (data[i].equals(element)){
    return i;
  }
}
return -1;
}

public int lastIndexOf(String element){
  for (int i = size - 1; i >= 0 ; i --){
    if (data[i].equals( element)){
    return i;
  }
}
return -1;
}

//Got help for Theodore Wu
public void add(int index, String element) {
   if (index < 0 || index > size()){
     throw new IndexOutOfBoundsException();
   }

   if (index == size) {
     this.add(element);
   }
   else {
     if (size >= data.length) {
       resize();}
     String prev;
     String newly = element;
     for (int i = index; i <=size; i++){
       prev = data[i];
       data[i] = newly;
       newly = prev;
     }
     size++;
   }
   }


public String remove(int index){
  if (index < 0 || index >= size()){
    throw new IndexOutOfBoundsException();}
String y = data [index];
for (int i = index; i < size - 1; i ++ ){
  data [i] = data [i+1];
}
size--;
return y;}

public boolean remove(String element){
  for (int i = 0; i < data.length; i ++){
    if (data[i].equals(element)){
      for (;i + 1< data.length; i ++){
        data [i] = data [i+1];
      }
      return true;
  }
}
return false;
}









}
