package Location;

public class Voiture {
    private int immariculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immariculation,String marque, float prixLocation) {
        // à compléter
        this.immariculation = immariculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmariculation() {

        return immariculation;
    }

    public void setImmariculation(int immariculation) {
        this.immariculation = immariculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {

        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + immariculation;
        return result;
    }

    public boolean equals(Object obj) {
        // à completer
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) // getClass() retourne le nom de la classe
            return false;
        Voiture other = (Voiture) obj;
        if (immariculation != other.immariculation)
            return false;
        return true;

    }

    public String toString() {
        // à completer
        return "immariculation: " + immariculation + " marque: " + marque + " prixLocation: " + prixLocation;
    }
}