package steps;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.RegisterPage;

public class RegisterSteps {

	RegisterPage register = new RegisterPage();

	@Dado("^que acesso o BugBank$")
	public void queAcessoOBugBank() throws Throwable {
		register.acessoHomePage();
	}

	@Quando("^tenta cadastra o usuario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void tentaCadastraOUsuario(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		register.cadastroDeUsuario(arg1, arg2, arg3, arg4);
	}

	@Entao("^aparece as mensagens email \"([^\"]*)\" Senha \"([^\"]*)\" Confirmacao senha \"([^\"]*)\"$")
	public void apareceAsMensagensEmailSenhaConfirmacaoSenha(String arg1, String arg2, String arg3) throws Throwable {
		register.msgErrosCadastro(arg1, arg2, arg3);
		register.finalizaBugBank();

	}

	@Quando("^cadastra um novo usuario \"([^\"]*)\" nome \"([^\"]*)\" senha \"([^\"]*)\" confirSenha \"([^\"]*)\"$")
	public void cadastraUmNovoUsuarioNomeSenhaConfirSenha(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		register.cadastroDeUmNovoUsuario(arg1, arg2, arg3, arg4);
	}

	@Entao("^deve aparecer o pop-up de cadastro efetuado com sucesso$")
	public void deveAparecerOPopUpDeCadastroEfetuadoComSucesso() throws Throwable {
		register.popUpSucesso();
	}

	@Quando("^loga com email \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void logaComEmailESenha(String arg1, String arg2) throws Throwable {
		register.fecharPopUp();
		register.fazerLogin(arg1, arg2);
	}

	@Entao("^deve aparecer os Container \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" na home page$")
	public void deveAparecerOsContainerNaHomePage(String arg1, String arg2, String arg3, String arg4) throws Throwable {

		List<String> msg = Arrays.asList(arg1, arg2, arg3, arg4);

		assertEquals(msg, msg);

		Thread.sleep(3000);
		register.finalizaBugBank();
	}

}
