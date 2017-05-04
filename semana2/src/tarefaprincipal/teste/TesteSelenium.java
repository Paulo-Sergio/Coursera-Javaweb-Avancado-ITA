package tarefaprincipal.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteSelenium {
/*
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test1PalavraTraduzida() throws Exception {
		driver.get(baseUrl + "/atividades-javawebavancado-semana2/");
		driver.findElement(By.name("palavra")).clear();
		driver.findElement(By.name("palavra")).sendKeys("good");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("Bom", driver.findElement(By.cssSelector("h3")).getText());
	}
	
	@Test
	public void test2PalavraTraduzida() throws Exception {
		driver.get(baseUrl + "/atividades-javawebavancado-semana2/");
		driver.findElement(By.name("palavra")).clear();
		driver.findElement(By.name("palavra")).sendKeys("bus");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("Ônibus", driver.findElement(By.cssSelector("h3")).getText());
	}
	
	@Test
	public void testPalavraNaoExiste() throws Exception {
		driver.get(baseUrl + "/atividades-javawebavancado-semana2/");
		driver.findElement(By.name("palavra")).clear();
		driver.findElement(By.name("palavra")).sendKeys("bank");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("bank", driver.findElement(By.cssSelector("h3")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}*/
}
