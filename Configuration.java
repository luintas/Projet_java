import java.util.ArrayList;

public class Configuration{
    private ArrayList<Caisse> caisses;
    private Joueur joueur;
    private Niveau niveau;

    public Configuration(Niveau n,Position positionJoueur){
        this.caisses = new ArrayList<Caisse>();
        this.niveau = n;
        this.joueur = new Joueur(this,positionJoueur);
    }
    public Configuration(Configuration c){
        this(c.getNiveau, c.getJoueur().getPosition());
    }
    public Niveau getNiveau() {
        return niveau;
    }
    public ArrayList<Caisse> getCaisses() {
        return caisses;
    }
    public Joueur getJoueur() {
        return joueur;
    }
    public boolean addCaisse(Position p){
        Caisse c= new caisse(this,p);
        caisses.add(c);
    }
    public Element get(Position p){
        if(joueur.getPosition().equals(p)){
            return this.joueur;
        }
        int i;
        for(i=0;i<this.caisses.size();i++){
            if(caisses.get(i).equals(p)){
                return caisses.get(i);
            }
        }
        return this.niveau.get(p);
    }
    public boolean estVide(Position p){
        return niveau.estVide(p);
    }
    public boolean estCible(Position p){
        return niveau.estCible(p);
    }
    public boolean bougerJoueurVers(Direction d){
        if(estVide(){
            if(estCible(p))
        }
    }
}