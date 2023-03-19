package CouplageFaible;

public class Voyage {

    public static void main(String[] args)
    {
        IVoiture voiture = new Voiture();
        voiture.setMoteur(new Moteur());

        voiture.rouler();
        System.out.println("Bon voyage !");
    }
}
