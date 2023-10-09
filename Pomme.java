public class Pomme extends Fruit {
  public Pomme(int p) {
    super(p);
  }
  public void afficher() {
    System.out.println("c'est une Pomme");
  }
  public void AfficherPoid() { 
    System.out.println("c'est une Pomme de "+ p +" grammes");
  }
}