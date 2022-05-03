#language: pt
#encoding: utf-8
Funcionalidade: LOGIN

  Cenario: REALIZAR LOGIN COM EMAIL INVALIDO
    Dado que o usuario acesse a pagina do BugBank
    Quando informa o email "teste#teste.com" e senha "123456"
    Entao deve aparecer a mensagem alerta "Formato inválido"

  Cenario: REALIZAR LOGIN COM SENHA INVALIDA
    Dado que o usuario acesse a pagina do BugBank
    Quando informa o email "teste@gmail.com" e senha "123"
    Entao deve aparecer popUp de alerta "Usuário ou senha inválido."

  Cenario: REALIZAR LOGIN SEM PREENCHER OS CAMPOS
    Dado que o usuario acesse a pagina do BugBank
    Quando informa o email "" e senha ""
    Entao deve aparecer a mensagem alerta email "É campo obrigatório" senha "É campo obrigatório"

  Cenario: REALIZAR LOGIN COM SUCESSO
    Dado que o usuario acesse a pagina do BugBank
    E cadastra o usuario "login@test.com" "login" "123456" "123456"
    Quando informa o email "login@test.com" e senha "123456"
    Entao deve ver a area logada com a conta cadastrada ""
