package sprint1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class facebook1 {
	WebDriver driver;

	@Given("Ouvrir le  navigateurs")
	public void ouvrir_le_navigateurs() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Given("ouvrir urls")
	public void ouvrir_urls() {
		driver.navigate().to("https://fr-fr.facebook.com/");
	}

	@When("Creer un nouveau comptes")
	public void creer_un_nouveau_comptes() {
		WebElement creercompte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		creercompte.click();
	}

	@When("Saisir Prenoms {string}")
	public void saisir_prenoms(String string) {
		WebElement prenom = driver.findElement(By.name("firstname"));
		prenom.sendKeys(string);
	}

	@When("nom de la familles {string}")
	public void nom_de_la_familles(String string) {
		WebElement nom = driver.findElement(By.name("lastname"));
		nom.sendKeys(string);
	}

	@When("saisir emails {string}")
	public void saisir_emails(String string) {
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys(string);
	}

	@When("Confirmer adresse emails {string}")
	public void confirmer_adresse_emails(String string) {
		WebElement email = driver.findElement(By.name("reg_email_confirmation__"));
		email.sendKeys(string);
	}

	@When("saisir mot de passes {string}")
	public void saisir_mot_de_passes(String string) {
		WebElement mdp = driver.findElement(By.id("password_step_input"));
		mdp.sendKeys(string);
	}

	@When("Selectionner le jour de naissances {string}")
	public void selectionner_le_jour_de_naissances(String string) {
		WebElement jour = driver.findElement(By.id("day"));
		Select selec = new Select(jour);
		selec.selectByValue(string);
	}

	@When("Selectionner le mois de naissances {string}")
	public void selectionner_le_mois_de_naissances(String string) {
		WebElement mois = driver.findElement(By.id("month"));
		Select selec1 = new Select(mois);
		selec1.selectByValue(string);
	}

	@When("Selectionner annee de naissances {string}")
	public void selectionner_annee_de_naissances(String string) {
		WebElement annee = driver.findElement(By.id("year"));
		Select selec2 = new Select(annee);
		selec2.selectByValue(string);
	}

	@When("Choisir le genres {string}")
	public void choisir_le_genres(String string) {
	
		WebElement genre = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		genre.click();
	}

	@When("cliquer sur le bouton inscrires")
	public void cliquer_sur_le_bouton_inscrires() {
		WebElement inscrire = driver.findElement(By.xpath("//button[@name='websubmit']"));
		inscrire.click();
	}

	@Then("fermer le sites")
	public void fermer_le_sites() {
		driver.close();
	
	}

}