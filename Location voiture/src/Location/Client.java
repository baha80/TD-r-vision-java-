package Location;

public class Client {
    private int code;
    private String nom;
    private String prenom;

    public Client(int code, String nom, String prenom) {
        // à compléter
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;

        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
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
        Client other = (Client) obj;
        if (code != other.code)
            return false;
        return true;

    }

    public String toString() {
        // à completer
        return "code: " + code + " nom: " + nom + " prenom: " + prenom;
    }
}