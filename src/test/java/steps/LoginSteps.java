package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;

public class LoginSteps {

	LoginPage login = new LoginPage();

	@Dado("^que o usuario acesse a pagina do BugBank$")
	public void queOUsuarioAcesseAPaginaDoBugBank() throws Throwable {
		login.acessoHomePage();
	}

	@Quando("^informa o email \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void informaOEmailESenha(String arg1, String arg2) throws Throwable {
		login.fazerLogin(arg1, arg2);
	}

	@Entao("^deve aparecer a mensagem alerta \"([^\"]*)\"$")
	public void deveAparecerAMensagemAlerta(String arg1) throws Throwable {
		login.mensagemAlert(arg1);
		login.finalizaBugBank();
	}

	@Entao("^deve aparecer popUp de alerta \"([^\"]*)\"$")
	public void deveAparecerPopUpDeAlerta(String arg1) throws Throwable {
		login.popUpAlert(arg1);
		login.finalizaBugBank();
	}

	@Entao("^deve aparecer a mensagem alerta email \"([^\"]*)\" senha \"([^\"]*)\"$")
	public void deveAparecerAMensagemAlertaEmailSenha(String arg1, String arg2) throws Throwable {
		login.mensagensAlerts(arg1, arg2);
		login.finalizaBugBank();
	}

	@Dado("^cadastra o usuario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void cadastraOUsuario(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		login.cadastraUsuario(arg1, arg2, arg3, arg4);
	}

	
	@Entao("^deve ver a area logada com a conta cadastrada \"([^\"]*)\"$")
	public void deveVerAAreaLogadaComAContaCadastrada(String arg1) throws Throwable {
		login.mesagemDeBoasVindas(arg1);
		login.finalizaBugBank();
	}

}
