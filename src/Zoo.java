public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Zoo Tunis", "Tunis");

        Animal lion = new Animal("Felins", "Lion", 5, true);
        Animal tiger = new Animal("Felins", "Tiger", 4, true);
        Animal zebra = new Animal("Herbivore", "Zebra", 6, false);

        myZoo.ajouterAnimal(lion);
        myZoo.ajouterAnimal(tiger);
        myZoo.ajouterAnimal(zebra);

        System.out.println("Liste des animaux :");
        myZoo.afficherAnimaux();

        System.out.println("Position Lion : " + myZoo.chercherAnimal("Lion"));

        myZoo.supprimerAnimal("Tiger");
        System.out.println("Après suppression :");
        myZoo.afficherAnimaux();
    }
}