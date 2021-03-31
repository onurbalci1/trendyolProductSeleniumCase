package pageModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailModel extends BaseModel {

    By txtElectronic = By.xpath("//a[@href='/butik/liste/elektronik']");
    By txtTvScreenSound = By.xpath("//a[@href='/rampage/alquist-sn-r10-siyah-3-5mm-rgb-gaming-oyuncu-mikrofonlu-kulaklik-p-57160663']/div[3]/div/div/span[2]");
    By txtProduct = By.xpath("//a[@href='/rampage/alquist-sn-r10-siyah-3-5mm-rgb-gaming-oyuncu-mikrofonlu-kulaklik-p-57160663']/div[3]/div/div/span[2]");
    By txtProductControl = By.className("pr-new-br");
    By btnBasket = By.xpath("//div[@class='add-to-bs-tx' and text()='Sepete Ekle']");
    By txtBasketCount = By.className("basket-item-count-container visible");
    By btnBasketApprove = By.className("btn Basket_CheckoutButton");



    public ProductDetailModel(WebDriver webDriver){
        super(webDriver);
    }


    public void clickElectronic() throws InterruptedException {
        WebElement target = webDriver.findElement(txtElectronic);
        hover(target);
        click(txtTvScreenSound,10 );
    }
    public String clickProduct() {
        String value = getText(txtProduct);
        click(txtProduct,10);
        return  value;
    }
    public String clickProduct2() {
        String value = getText(txtProductControl);
        return  value;
    }

    public void clickBasket() {
        click(btnBasket,10);
    }
    public String controlBasketCount() {
        return getText(txtBasketCount);
    }

    public void clickBasketCount() {
        click(txtBasketCount,10);
    }
    public void clickBasketApprove() {
        click(btnBasketApprove,10);
    }

}
