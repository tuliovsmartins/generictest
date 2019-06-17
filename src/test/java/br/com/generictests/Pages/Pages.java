package br.com.generictests.Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Pages extends PageObject {

	private static final String BUSCA_POR_NOME = "//*[contains(text(),'%s')]";

	public void buttonClick(String value) {
		WebElementFacade button = findAll(By.tagName("button")).stream()
				.filter(e -> e.isVisible() && value.equals(e.getText().trim()))
				.findFirst().get();
		button.click();
	}

	public void click(String value) {
		$(String.format(BUSCA_POR_NOME, value)).click();
	}

	public void enterValueByName(String Name, String value) {
		$(String.format("//*[@name=\"%s\"]", Name)).typeAndEnter(value);
	}


	public void getLinkByText(String value) {

		findAll(By.linkText(value)).stream().filter(e -> e.isVisible() && e.isEnabled())
				.findFirst().get().click();
	}
}