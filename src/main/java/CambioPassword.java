import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class CambioPassword {

    public static void DatosPersonales(String nombre, String apellido, String password, String nuevoPassword, String repiteNuevoPassword) {

        WebDriver driver = getChromeDriver();

        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();

        driver.findElement(By.id("firstname")).sendKeys(nombre);
        driver.findElement(By.id("lastname")).sendKeys(apellido);
        driver.findElement(By.id("old_passwd")).sendKeys(password);
        driver.findElement(By.id("passwd")).sendKeys(nuevoPassword);
        driver.findElement(By.id("confirmation")).sendKeys(repiteNuevoPassword);
        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();
    }
}
