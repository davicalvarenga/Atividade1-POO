public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("DD");
        dog.setIdade(3);
        
        Gato cat = new Gato();
        cat.setNome("Bichento");
        cat.setIdade(2);
        
        System.out.println("Cachorro: " + dog.getNome() + ", " + dog.getIdade() + " anos");
        dog.latir();
        
        System.out.println("Gato: " + cat.getNome() + ", " + cat.getIdade() + " anos");
        cat.miar();
    }
}
