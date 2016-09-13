package ressources.withdraw;
import metier.withdraw.WithdrawBO;
import model.dto.WithdrawDTO;
import model.exception.WithdrawException;

import javax.ws.rs.*;

/**
 * Ressource REST dédiée au retrait
 */
@Path("/withdraw")
public class WithdrawRessource {


    @Autowired
    private WithdrawBO mWithdrawBO;


    @POST
    @Consumes("application/json")
    @Produces("application/json")
    /**
     *  méthode permettant de créer un retrait.
     */
    public boolean createWithdraw(WithdrawDTO pWithDraw) throws WithdrawException {
        return mWithdrawBO.withdraw(pWithDraw);


    }




}
