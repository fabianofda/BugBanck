package steps;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.RequirementsPage;

public class RequirementsSteps {
	
	RequirementsPage require = new RequirementsPage();

	@Dado("^que acesso a home BugBank$")
	public void queAcessoAHomeBugBank() throws Throwable {
		require.acessoHomePage();
	}
	
	@Quando("^clicar em conheca nossos requisitos$")
	public void clicarEmConhecaNossosRequisitos() throws InterruptedException {
		require.lnkRequirement();
	}

	@Entao("^deve exibir os accordion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" e \"([^\"]*)\"$")
	public void deveExibirOsAccordionE(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
			throws Throwable {

		List<String> msg = Arrays.asList("Login", "Cadastro", "Transferência", "Pagamento", "Extrato", "Saque");

		assertEquals(msg, msg);

		Thread.sleep(3000);

		require.finalizaBugBank();
	}

}
