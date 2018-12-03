import java.util.ArrayList;

	
public class Niveau {

	private Immobile [][]grille;
	private ArrayList<Position> cibles;
	
	public Niveau(int x, int y) {
		grille = new Immobile[x][y];
		this.cibles = new ArrayList<Position>();
	}
	public int getX(){
		return grille.length;
		
    }
    public int getY(){
        return grille[0].length;
    }
	public boolean addCible(Position p) {
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				return false;
			}
		}
		if((this.estVide(p))&&(!this.estCible(p))){
            cibles.add(p);
            return true;
        }
        else
        return false;
	}
	public boolean estVide(Position p) {
		if(grille[p.getX()][p.getY()]==null) {
			return true;
		}
		return false;
	}
	public boolean estCible(Position p) {
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				return true;
			}
		}
		return false;
	}
	public boolean addMur(Position p) {
		if(grille[p.getX()][p.getY()]!=null) {
			return false;
		}else {
			grille[p.getX()][p.getY()]=new Mur();
			return true;
		}
	}
	
	
	public Element get(Position p){
		return grille[p.getX()][p.getY()];
	}
}
