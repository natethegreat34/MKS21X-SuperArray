

public class River {
      public static void main (String[]args) {
        System.out.println("Testing pass #0");
    	  SuperArray a = new SuperArray(0);
        System.out.println("done!");

        System.out.println("\nTesting pass #1");
        a.add("hello"); a.add("hello"); a.add("hello");
        System.out.println("done! a is: " + a);
        System.out.println(a.size());
        System.out.println("done!");
        a.clear();

        System.out.println("\nTesting pass #2");
        //a.add("world");
        //System.out.println(a.toStringDebug());
        for (int i = 0; i < 3000; i++){
          a.add(i,"world");
        }
        //System.out.println(a);
        System.out.println(a.size());
        System.out.println("done!");

        System.out.println("\nTesting pass #3");
        for (int i = 0; i < 200; i++){
          a.remove("world");
        }
        System.out.println("size(2800): " + a.size());

        System.out.println("\nTesting pass #4");
        for (int i = 0; i < 100; i++){
          if (a.remove("world") != true) System.out.println("uh oh! your .remove(element) returned the wrong thing!!"); break;
        }
        for (int i = 0 ; i < 100; i++){
          if (!a.remove(i).equals("world")) System.out.println("uh oh! your .remove(index) returned the wrong thing!!"); break;
        }
        System.out.println("done!");

        System.out.println("\nTesting pass #5");
        try{
            a.add(99999,"wwwrrrrooooonngggg");
            a.add(-10, "poop");
            System.out.println("sorry, but your .add() method does not throw the correct error");
          }
          catch (IndexOutOfBoundsException e){
            System.out.println("congratulations! your .add() methods threw the correct exception");
          }
          try{
            a.add(-10, "poop");
            System.out.println("sorry, but your .add() method does not throw the correct error");
          }
          catch (IndexOutOfBoundsException e){
            System.out.println("congratulations! your .add() methods threw the correct exception");
          }
          try{
            a.remove(99999);
            System.out.println("sorry, but your .remove() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .remove() methods threw the correct exception");
          }
          try{
            a.remove(-10);
            System.out.println("sorry, but your .remove() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .remove() methods threw the correct exception");
          }
          try{a.get(-10);
            System.out.println("sorry, but your  .get() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .get() methods threw the correct exception");
          }
          try{a.get(9999);
            System.out.println("sorry, but your  .get() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .get() methods threw the correct exception");
          }
          try{a.set(-10, "poop");
            System.out.println("sorry, but your  .set() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .set() methods threw the correct exception");
          }
          try{a.set(99999,"poop");
            System.out.println("sorry, but your  .set() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .set() methods threw the correct exception");
          }
          try {SuperArray b = new SuperArray(-19);
            System.out.println("sorry, but your constructor does not throw the correct error");}
          catch(IllegalArgumentException e) {
            System.out.println("congratulations! your constructor threw the correct exception");
          }
          System.out.println("done!");
          a.clear();

          System.out.println("\nTesting pass #6");
          for (int i = 100; i >= 0; i--){a.add(0, "" + i);}
          for (int i = 0; i <= 100; i++){a.add(a.size(), "" + i);}
            //System.out.println(a);
          System.out.println("done!");

          System.out.println("\nTesting pass #7");
          //System.out.println(a.size());
          //System.out.println(a);
          for (int i = 0; i < 100; i++){
            if (a.indexOf(i+"") != i) System.out.println("uh oh! indexOf does not return correctly!"); break;
          }
          System.out.println("done!");

          System.out.println("\nTesting pass #8");
          //System.out.println(a.lastIndexOf("100"));
          //System.out.println(a.size());
          for (int i = 0; i < 100; i++){
            if (a.lastIndexOf(i+"") != i+101) System.out.println("uh oh! indexOf does not return correctly!"); break;
          }
          System.out.println("done!");

          System.out.println("\nTesting pass #9");
          for (int i = 0; i <= 100; i++){
            //System.out.println(i);
            a.set(i,100-i+"");
          }
          for (int i = 0; i <= 100; i++){
            if (!a.get(i).equals(100-i+"")) System.out.println("uh oh on the get/set"); break;
          }
          System.out.println("done!");



        /*
          a.add("hello");
          System.out.println("testing .add() & .toString() should print (=>) [hello]: " + a);
          a.clear();
          System.out.println(".clear() and .isEmpty()=> [] true: " + a+ " " + a.isEmpty());
          System.out.println(".toStringDebug()=> [hello, null...]: " + a.toStringDebug());
          System.out.println(".size => 0: " + a.size());
          a.add(0,"world"); a.add(0,"hello");
          System.out.println(".add(index,string) => [hello, world]: "+ a);
    	    a.add(1,"this");
          System.out.println(".add(index,string) => [hello, this, world]: "+ a);
          System.out.println(".get() => world: " + a.get(2));
          System.out.println(".set() => this: " + a.set(1,"your"));
          System.out.println("=> [hello, your, world]: " +a);
          System.out.println(".contains() => true false: " + a.contains("world") + " " + a.contains("this"));
          a.add("hello"); a.add("world");
          System.out.println(".indexOf() => 012: " + a.indexOf("hello") + a.indexOf("your") + a.indexOf("world"));
          System.out.println(".lastIndexOf() => 314: " + a.lastIndexOf("hello") + a.lastIndexOf("your") + a.lastIndexOf("world"));
          System.out.println(".remove(element) => true: " + a.remove("hello") + a.remove("world"));
          System.out.println(".remove(element) => [your, hello, world]: " + a);
          System.out.println(".remove(index) => hello: " +a.remove(1));
          System.out.println(".remove(index) => [your, world]: " + a + "\n");
          try{
            a.add(10,"wwwrrrrooooonngggg");
            System.out.println("sorry, but your .add() method does not throw the correct error");
          }
          catch (IndexOutOfBoundsException e){
            System.out.println("congratulations! your .add() methods threw the correct exception");
          }
          try{
            a.remove(9);
            System.out.println("sorry, but your .remove() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .remove() methods threw the correct exception");
          }
          try{
            a.get(9);
            a.set(9,"wrrrrrooooonnnnngggg");
            System.out.println("sorry, but your .set() & .get() method does not throw the correct error");
          }
          catch(IndexOutOfBoundsException e){
            System.out.println("congratulations! your .set() & .get() methods threw the correct exception");
          }
          */
      }
}
