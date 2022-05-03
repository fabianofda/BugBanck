package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.TransferPage;

public class TransferSteps {

	TransferPage transfer = new TransferPage();

	@Dado("^que acesso o BugBank para transferir$")
	public void queAcessoOBugBankParaTransferir() throws Throwable {
		transfer.acessoHomePage();
	}

	@Quando("^cadastro o usuario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void cadastroOUsuario(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		transfer.cadastroDeUsuario(arg1, arg2, arg3, arg4);
		transfer.fecharPopUp();
	}

	@Quando("^loga com o email \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void informaOEmailESenha(String arg1, String arg2) throws Throwable {
		transfer.fazerLogin(arg1, arg2);
	}

	@Quando("^clicar em transferencia$")
	public void clicarEmTransferencia() throws Throwable {
		transfer.btnTransferencia();
	}

	@Dado("^preencher a conta invalida \"([^\"]*)\" digito \"([^\"]*)\" valor \"([^\"]*)\" e descricao \"([^\"]*)\"$")
	public void preencherAContaDigitoValorEDescricaoInvalidos(String arg1, String arg2, String arg3, String arg4)
			throws InterruptedException {
		transfer.formTransferencia(arg1, arg2, arg3, arg4);

	}

	@Dado("^preencher a conta com \"([^\"]*)\" digito \"([^\"]*)\" valor \"([^\"]*)\" e descricao \"([^\"]*)\"$")
	public void preencherAContaDigitoValorEDescricao(String arg1, String arg2, String arg3, String arg4)
			throws InterruptedException {

		String numConta = transfer.numConta();
		String[] conta = numConta.split("-");

		transfer.formTransferencia(conta[0], conta[1], arg3, arg4);

	}

	@Dado("^clicar em tranferir agora$")
	public void clicarEmTranferirAgora() throws Throwable {
		transfer.btnTransfAgora();
		Thread.sleep(1000);
	}

	@Entao("^deve aparecer um pop up com a mensagem \"([^\"]*)\"$")
	public void deveAparecerUmPopUpComAMensagem(String arg1) throws Throwable {
		transfer.popUpAlertModal(arg1);
		Thread.sleep(1000);
		transfer.finalizaBugBank();

	}

}
