package Location;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom ; 


       
       
    }

    public void ajoutVoiture(Voiture v) {
        if (vs == null) {
            vs = new ListVoitures();
        }
        vs.ajouterVoiture(v);
    }

    public void suppVoiture(Voiture v) throws VoitureException {
        if (vs != null) {
            vs.supprimerVoiture(v);
        } else {
            throw new VoitureException("Aucune voiture disponible dans l'agence.");
        }
    }

    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (ClientVoitureLoue.containsKey(cl)) {
            ListVoitures voituresLouees = ClientVoitureLoue.get(cl);
            if (voituresLouees.getNbVoitures() >= 3) {
                throw new VoitureException("Le client a déjà loué 3 voitures.");
            }
            voituresLouees.ajouterVoiture(v);
        } else {
            ListVoitures voituresLouees = new ListVoitures();
            voituresLouees.ajouterVoiture(v);
            ClientVoitureLoue.put(cl, voituresLouees);
        }
    }

    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (ClientVoitureLoue.containsKey(cl)) {
            ListVoitures voituresLouees = ClientVoitureLoue.get(cl);
            voituresLouees.supprimerVoiture(v);
        } else {
            throw new VoitureException("Le client n'a pas loué de voitures.");
        }
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {
        // à completer
    }

    public Set<Client> ensembleClientsLoueurs() {
        // à completer
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        // à completer
    }

    public void afficheLesClientsEtLeursListesVoitures() {
        // à compléter
    }

 public Map<Client, ListVoitures>triCodeCroissant(){
6

 // à completer
 }

    public Map<Client, ListVoitures> triNomCroissant() {
        // à completer
    }
}
