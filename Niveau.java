import java.util.ArrayList;

public class Niveau{
    private ArrayList<Position> cible;
    private Immobile tab[][];

    public Niveau(int x,int y){
        this.tab = new tab[y][x];
        this.cible = new ArrayList<Position>();
    }
    public int getX(){
        tab[0].length();
    }
    public int getY(){
        tab.length();
    }
    public boolean addCible(Position e){
        if((this.estVide(e))&&(!this.estCible(e))){
            cible.add(e);
            return true;
        }
        else
        return false;
    }
    public boolean estVide(Position e){
        if(tab[e.getY()][e.getX()].type== MUR)
            return false;
        else
            return true;
        } 
    public boolean estCible(Position e){
        int i;
        for(i=0;i<this.cible.size();i++){
            if(cible.get(i).equals(e)){
                return true;
            }
        }
        return false;
    }
    public boolean addMur(){
        return True;
    }
    public Immobile get(Position p){
        return tab[p.getY()][p.getX()];
    }
}