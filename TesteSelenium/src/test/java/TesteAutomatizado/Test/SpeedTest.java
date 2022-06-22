package TesteAutomatizado.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.Console;
import java.util.jar.Attributes.Name;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTest {

    // comando para iniciar o navegador
    private WebDriver driver;
    // caminho do site onde será realizado o teste
    private final String URL_BASE = "https://www.speedtest.net/pt/";
    // caminho do driver na minha maquina
    private final String CAMINHO_DRIVER = "src/test/java/TesteAutomatizado/Resource/chromedriver-10205005.exe";



    // método de teste: criando a função
    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        // instanciando o driver: abrir o navegador
        driver = new ChromeDriver();
        // gereciando o que será feito: abrir janela maximizada
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    
}

// caso de teste
@Test
public void SpeedTest(){
    iniciar();

    WebElement clique = driver.findElement(By.className("js-start-test"));
    clique.click();
    
}
}