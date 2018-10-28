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
}
