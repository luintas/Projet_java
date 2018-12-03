import java.util.ArrayList;
public class Joueur extends Mobile{
	
	private ArrayList<Direction> histo = new ArrayList<Direction>();
	
	public Joueur(Configuration c,Position p) {
		super(Type.JOUEUR,p,c);
	}
	
	public Joueur(Configuration c,Joueur j) {
		super(Type.JOUEUR,j.getPosition(),c);
	}
	
	public ArrayList<Direction> getHisto() {
		return histo;
	}
	public int getNbCoups(){
		return histo.size();
	}
	//A modifier
	public boolean bougerVers(Direction d) {
		if(super.configuration.estVide(getPosition().add(d))){
			
			return true;
		}
		getPosition().sub(d);
		if(super.configuration.estCaisse(getPosition().add(d)) && super.configuration.estVide(getPosition().add(d).add(d))) {
			
			return true;
		}
		getPosition().sub(d);
		getPosition().sub(d);
		return false;
	}
}
