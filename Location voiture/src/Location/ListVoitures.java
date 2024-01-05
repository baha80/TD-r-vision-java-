package Location;

public class ListVoitures {
    //classe ListVoitures qui permet de stocker un ensemble de voiture dans une liste
    private Voiture[] listVoitures;
    private int comp;


    //supprimer une voiture de la liste
    public void supprimerVoiture(Voiture v) {
        
        int i = 0;
        while (i < comp && !listVoitures[i].equals(v)) {
           
            i++;
        }
        if (i < comp) {
            listVoitures[i] = listVoitures[comp - 1];
            comp--;
        }
    }

    //ajouter une voiture dans la liste
    public void ajouterVoiture(Voiture v) {
        if (comp < listVoitures.length) {
            listVoitures[comp] = v;
            comp++;
        }
    }
    //afficher la liste des voitures
    public void afficherListeVoitures() {
        for (int i = 0; i < comp; i++) {
            System.out.println(listVoitures[i]);
        }
    }

    public int getNbVoitures() {
        return comp;
    }
}
