#language: pt
#encoding: utf-8
Funcionalidade: CADASTRO

  Cenario: REALIZAR CADASTRO SEM PREENCHER OS CAMPOS
    Dado que acesso o BugBank
    Quando tenta cadastra o usuario "" "" "" ""
    Entao aparece as mensagens email "É campo obrigatório" Senha "É campo obrigatório" Confirmacao senha "É campo obrigatório"

  Cenario: REALIZAR CADASTRO DE UMA CONTA
    Dado que acesso o BugBank
    Quando cadastra um novo usuario "teste@teste.com" nome "teste cadastro" senha "123456" confirSenha "123456"
    Entao deve aparecer o pop-up de cadastro efetuado com sucesso

  Cenario: VALIDAR MENUS NA HOME PAGE
    Dado que acesso o BugBank
    Quando cadastra um novo usuario "teste@teste.com" nome "teste cadastro" senha "123456" confirSenha "123456"
    E loga com email "teste@teste.com" e senha "123456"
    Entao deve aparecer os Container "TRANSFERÊNCIA" "PAGAMENTOS" "EXTRATO" "SAQUE" na home page
