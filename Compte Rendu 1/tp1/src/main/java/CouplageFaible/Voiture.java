package CouplageFaible;

public class Voiture implements IVoiture{



    private IMoteur moteur;

    @Override
    public void rouler() {
      moteur.demarrer();
      System.out.println
              ("la voiture roule correctement");
    }

    public void setMoteur(IMoteur moteur) {
        this.moteur = moteur;
    }
}
