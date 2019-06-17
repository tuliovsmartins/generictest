package br.com.generictests.Steps;

import br.com.generictests.Pages.Pages;
import br.com.generictests.Util.Util;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import net.thucydides.core.util.EnvironmentVariables;

public class Steps {

	Pages pages;
	EnvironmentVariables environmentVariables;

	@Dado("^Eu acessei o site$")
	public void eu_acessei_o_site() {
		pages.openUrl(environmentVariables.getProperty(Util.SITE));
		pages.waitFor(3).second();
	}

	@Dado("^Eu entrei com o termo de busca \"([^\"]*)\"$")
	public void euEntreiComOTermodeBusca(String arg0) throws Throwable {

		pages.enterValueByName("q", arg0);
	}

	@Dado("^Eu cliquei em \"([^\"]*)\"$")
	public void eu_cliquei_em(String arg1) {
		pages.waitFor(2).second();
		pages.getLinkByText(arg1);
	}

}
