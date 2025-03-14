import java.util.ArrayList;
import java.util.Iterator;

public class ListVoitures {
    private ArrayList<Voiture> voitures;
    public ListVoitures() {
        this.voitures = new ArrayList<Voiture>();
    }
    public ListVoitures(ArrayList<Voiture> voitures) {
        if(voitures != null){
            this.voitures = voitures;
        }
        else{
            this.voitures=new ArrayList<Voiture>(voitures);
        }


    }

    public ArrayList<Voiture>getVoitures() {
        return this.voitures;
    }
    public void setVoitures(ArrayList<Voiture>voitures){
        this.voitures=voitures;

    }
    public void ajoutVoiture(Voiture v) throws VoitureException{
        if(voitures.contains(v)){
        throw new VoitureException();}
        voitures.add(v);
    }
    public Iterator<Voiture> iterateur(){
        return voitures.iterator();
    }
    public int size(){
        return voitures.size();}
    public void affiche(){
        for (Voiture v : voitures){
            System.out.println(v);
        }

    }

    public void suprimerVoiture(Voiture v) {
        if(!(v==null)){
            this.voitures.remove(v);
        }
    }
}