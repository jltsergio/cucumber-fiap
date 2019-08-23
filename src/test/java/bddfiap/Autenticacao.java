package bddfiap;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

class Autenticacao {
    static String logarUsuario(String login, String pass) {
        System.setProperty("webdriver.chrome.driver", 
"D:/aluno/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        String retorno = "";
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("i.fa-sign-in")).click();
        if( driver.getCurrentUrl().equalsIgnoreCase("http://the-internet.herokuapp.com/secure") ) {             
            retorno = "Usuario autenticado";
        } else { 
            retorno = "Visitante";
        } 
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { }
        driver.close(); 
        return retorno;
    }
}
