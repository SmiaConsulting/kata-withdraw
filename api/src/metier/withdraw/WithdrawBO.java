package metier.withdraw;

import model.dto.WithdrawDTO;
import model.exception.WithdrawException;

/**
 * BusinessObject contenant les traitements métiers liés au retrait.
 */
@Component
public class WithdrawBO {

    /**
     * Methode permettant d'effectuer le traitement métier de retrait
     * @param pWithDraw
     * @return
     * @throws WithdrawException
     */
    public boolean withdraw(WithdrawDTO pWithDraw) throws WithdrawException {
        //Vérification des données de l'objet withdraw
        controlesWithdraw(pWithDraw)


        //maj du solde =>  maj BDD du solde pour l'id client en entrée

        //Alternative : retourne le solde
        return true;

    }

    /**
     * Methode permettant de controler la validité du retrait.
     * @param pWithdraw
     * @throws WithdrawException
     */
    private void controlesWithdraw(WithdrawDTO pWithdraw) throws WithdrawException {
        if(pWithdraw == null) {
            throw new WithdrawException("Le retrait est null");
        } else  if(pWithdraw.getMontant() == null) {
            throw new WithdrawException("Le montant est null");
        } else  if(pWithdraw.getIdClient() == 0) {
            throw new WithdrawException("Le client n'est pas indiqué");
        }
        //Vérification du solde => appel de ClientBO pour verifier que le solde en BDD soit inférieur au montant du retrait.
    }




}
