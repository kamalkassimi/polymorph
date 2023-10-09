
import java.util.ArrayList;



// public class test {
//   public static void main(String[] args) {
//     Fruit fruits[] = new Fruit[5];
//     fruits[0] = new Orange(15);
//     ArrayList<Fruit> f1 = new ArrayList<Fruit>();
//     f1.add(new Orange(15));
//   }
// }
///


public class test {
    public static void main(String[] args) {
        Fruit f1= new Orange(15);
        Fruit f2= new Pomme(18);

        Fruit[] list= new Fruit[3];
        Fruit  o = new Orange(15);
        Fruit  P = new Pomme(18);
        Fruit  p = new Pomme(108);
        f1.afficher();
        f2.afficher();
        
        // for (int i = 0; i <list.length ; i++) {
        //     list[i].afficher();
        // }
        
        
    }
}
