public class ZooManagement {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Animal chat = new Animal("félin", "Ferrari", 19, true);
        Zoo myzoo = new Zoo("Mon zoo", "Papa", 2, animals);
        myzoo.ajouteranimal(chat, 0);
        myzoo.displayzoo();
    }
}
