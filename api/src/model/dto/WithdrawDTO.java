package model.dto;

/**
 * Classe representant un retrait
 */
public class WithdrawDTO {

    /**
     * id du client effectuant le retrait. TODO Utiliser un objet client.
     */
    private int idClient;

    /**
     * Montant du retrait
     */
    private Double montant;


    /**
     *
     * @return Double
     */
    public Double getMontant() {
        return montant;
    }


    /**
     *
     * @param montant
     */
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    /**
     *
     * @return int
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     *
     * @param idClient
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
