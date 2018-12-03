import java.util.ArrayList;

public class Configuration {
	
	private ArrayList<Caisse> caisses;
    private Joueur joueur;
	private Niveau niveau;
	
    public Configuration(Niveau n,Position positionJoueur){
        this.caisses = new ArrayList<Caisse>();
        this.niveau = n;
        this.joueur = new Joueur(this,positionJoueur);
    }
    public Configuration(Configuration c){
		this(c.niveau, c.joueur.getPosition());
	}
	public int getX() {
		return niveau.getX();
	}
	public int getY() {
		return niveau.getY();
	}
	public boolean addCaisse(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return false;
			}
		}
		if(niveau.estVide(p)) {
			caisses.add(new Caisse(this, p));
			return true;
		}
		return false;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public ArrayList<Caisse> getCaisses() {
		return caisses;
	}
	public boolean estCaisse(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return true;
			}
		}
		return false;
	}
	public boolean estVide(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return false;
			}
		}
		if(niveau.estVide(p)) {
			return true;
		}
		return false;
    }
    public boolean estCible(Position p){
        return niveau.estCible(p);
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
	public boolean bougerJoueurVers(Direction d) {
		/*if(estVide()){
            if(estCible(p))
		}*/
		return true;
	}
	public boolean victoire() {
		return true;
	}
	public String toString() {
		return "";
	}
}
