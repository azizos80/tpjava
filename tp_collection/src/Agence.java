import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client ,ListVoitures> ClientVoitureLoue;
    public Agence(String nom) {
    this.nom = nom;}
    public String getNom() { return nom;}
    public void setNom(String nom) { this.nom = nom;}
    public void ajoutVoiture(Voiture v) throws VoitureException{
        vs.ajoutVoiture(v);
    }

    public void suprimerVoiture(Voiture v)throws VoitureException {
        vs.suprimerVoiture(v);
    }
    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException{
        if(ClientVoitureLoue.containsKey(cl)){
            ClientVoitureLoue.get(cl).ajoutVoiture(v);
            vs.suprimerVoiture(v);
        }
        else{
            ListVoitures c=new ListVoitures();
            c.ajoutVoiture(v);
        }

    }
    public void retourClientVoiture(Client cl ,Voiture v) throws VoitureException{
        ClientVoitureLoue.get(cl).suprimerVoiture(v);
        vs.ajoutVoiture(v);
    }

    public List<Voiture> selectVoitureSelonCritere(Critere cl)  {
        List<Voiture> voitures=new ArrayList<Voiture>();
        for(int i=0;i<this.vs.size();i++){
            
        }

    }

}