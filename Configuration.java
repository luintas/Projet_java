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
        this(c.getNiveau, c.getJoueur().getPosition());
	public int getX() {
		return niveau.getY();
	}
	public int getY() {
		return niveau.getX();
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
		if(estVide(){
            if(estCible(p))
        }
	}
	public boolean victoire() {
		
	}
	public String toString() {
		
	}
}
