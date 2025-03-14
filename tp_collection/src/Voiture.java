import java.util.Objects;

public class Voiture {
    private int immariculation;
    private String marque;
    private float prixLoc;

    public Voiture(int immariculation, String marque, float prixLoc) {
        this.immariculation = immariculation;
        this.marque = marque;
        this.prixLoc = prixLoc;
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

    public float getPrixLoc() {
        return prixLoc;
    }

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(immariculation, marque, prixLoc);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Voiture other = (Voiture) obj;
        return immariculation == other.immariculation && Objects.equals(marque, other.marque)
                && Float.floatToIntBits(prixLoc) == Float.floatToIntBits(other.prixLoc);
    }

    @Override
    public String toString() {
        return "Voiture [immariculation=" + immariculation + ", marque=" + marque + ", prixLoc=" + prixLoc + "]";
    }

}


