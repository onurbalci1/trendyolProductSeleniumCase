package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageModel.ProductDetailModel;

public class ProductDetailTest extends BaseTest {
    @Test
    public void productControl() throws InterruptedException {
        ProductDetailModel productDetailModel = new ProductDetailModel(webDriver);
        productDetailModel.clickElectronic();
        productDetailModel.scrollDown();
        String value = productDetailModel.clickProduct();
        String value2 = productDetailModel.clickProduct2();
        Assert.assertTrue(value.contains(value2),"İlgili ürünün text'i yanlış");
        productDetailModel.clickBasket();
        Assert.assertEquals(productDetailModel.controlBasketCount(),"1","Sepetteki ürün sayısı yanlıi");
        productDetailModel.clickBasketCount();
        productDetailModel.clickBasketApprove();
    }
}
