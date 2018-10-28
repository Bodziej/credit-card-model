package bk.creditcard;
import org.junit.Assert;
import org.junit.Test;
public class CreditCardTest {
    
    @Test
    public void allowAssignLimit(){
        //arrange / given
        CreditCard card = new CreditCard();
        //act// when
        card.assignLimit(2000);
        //asser//then
        Assert.assertTrue(card.getBalance() == 2000);
    }
    
    @Test
    public void allowBlockCard();{
    CreditCard card = new CreditCard();
    card.block();
    Assert.assertTrue(card.isBlocked);
    }
    
    @Test
    public void allowWithdrawMoney(){
        CreditCard card = new CreditCard();
        card.assignLimit(2000);
        card.withdraw(200)
        Assert.assertEquals(1800, card.getBalance()); 
    }
    
    @Test
    xdxdx
}
