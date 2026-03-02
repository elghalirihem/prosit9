//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville");


        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Éléphant", "Babar", 10, true);
        Animal giraffe = new Animal("Girafe", "Sophie", 7, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);

        myZoo.displayZoo();

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal("Babar");
        if (index != -1) {
            System.out.println("L'animal Babar a été trouvé à l'indice " + index);
        } else {
            System.out.println("L'animal Babar n'a pas été trouvé dans le zoo.");
        }

        boolean removed = myZoo.removeAnimal(elephant);
        if (removed) {
            System.out.println("L'animal Babar a été supprimé du zoo.");
        } else {
            System.out.println("L'animal Babar n'a pas été trouvé dans le zoo.");
        }

        Zoo zooA = new Zoo("Zoo A", "Ville A");
        Zoo zooB = new Zoo("Zoo B", "Ville B");
        zooA.addAnimal(new Animal("Félin", "Tigre", 4, true));
        zooB.addAnimal(new Animal("Oiseau", "Aigle", 3, false));

        Zoo zooAvecLePlusDAanimaux = Zoo.comparerZoo(zooA, zooB);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecLePlusDAanimaux.name);

        System.out.println("Le zoo est-il plein ? " + Zoo.isZooFull(myZoo));
    }
}