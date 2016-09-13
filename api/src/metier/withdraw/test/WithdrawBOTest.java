package metier.withdraw.test;
import metier.withdraw.WithdrawBO;
import model.dto.WithdrawDTO;
import model.exception.WithdrawException;
import org.junit.Test;
/**
 * Classe de test JUnit pour le BusinessObject de retrait
 */
public class WithdrawBOTest {

    @Autowired
    private WithdrawBO mWithdrawBO;

    @Test
    public final void testWithdrawOK() throws WithdrawException {

        //Init withdraw
        WithdrawDTO vWithdraw = new WithdrawDTO();
        vWithdraw.setIdClient(1);
        vWithdraw.setMontant(new Double(25));

        //Appel du traitement de withdraw
        Assert.assertTrue(mWithdrawBO.withdraw(vWithdraw));
    }

    @Test
    @Test(expected = WithdrawException.class)
    public final void testWithdrawSansMontant() throws WithdrawException {

        //Init withdraw
        WithdrawDTO vWithdraw = new WithdrawDTO();
        vWithdraw.setIdClient(1);

        //Appel du traitement de withdraw
        mWithdrawBO.withdraw(vWithdraw);
    }

    @Test
    @Test(expected = WithdrawException.class)
    public final void testWithdrawSansClientId() throws WithdrawException {

        //Init withdraw
        WithdrawDTO vWithdraw = new WithdrawDTO();
        vWithdraw.setMontant(new Double(25));

        //Appel du traitement de withdraw
        mWithdrawBO.withdraw(vWithdraw);
    }

    @Test
    @Test(expected = WithdrawException.class)
    public final void testWithdrawNull() throws WithdrawException {

        //Init withdraw
        WithdrawDTO vWithdraw = null;

        //Appel du traitement de withdraw
        mWithdrawBO.withdraw(vWithdraw);
    }

    @Test
    @Test(expected = WithdrawException.class)
    public final void testWithdrawSuperieurSolde() throws WithdrawException {

        //Init withdraw
        WithdrawDTO vWithdraw = new WithdrawDTO();
        vWithdraw.setIdClient(1);
        vWithdraw.setMontant(new Double(200));

        //Appel du traitement de withdraw
        mWithdrawBO.withdraw(vWithdraw);
    }
}
