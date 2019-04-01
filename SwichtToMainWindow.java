package co.com.bancolombia.certification.finaclefe.interactions;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class SwichtToMainWindow implements Interaction {

	WebDriver hisDriver;
	private String parentHandle;

	public String getStrWindowHandler() {
		return parentHandle;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		hisDriver = Serenity.getWebdriverManager().getCurrentDriver();
		hisDriver.switchTo().window(getStrWindowHandler());
	}
}
