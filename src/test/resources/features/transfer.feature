#language: pt
#encoding: utf-8
Funcionalidade: TRANSFERENCIA

  Cenario: REALIZAR UMA TRANSFERENCIA INVALIDA OU INEXISTENTE
    Dado que acesso o BugBank para transferir
    Quando cadastro o usuario "teste@teste.com" "teste cadastro" "123456" "123456"
    Quando loga com o email "teste@teste.com" e senha "123456"
    E clicar em transferencia
    E preencher a conta invalida "1" digito "9" valor "100" e descricao "transferencia teste"
    E clicar em tranferir agora
    Entao deve aparecer um pop up com a mensagem "Conta inválida ou inexistente"

  Cenario: REALIZAR UMA TRANSFERENCIA PRA MESMA CONTA
    Dado que acesso o BugBank para transferir
    Quando cadastro o usuario "teste@teste.com" "teste cadastro" "123456" "123456"
    Quando loga com o email "teste@teste.com" e senha "123456"
    E clicar em transferencia
    E preencher a conta com "" digito "" valor "250" e descricao "transf teste"
    E clicar em tranferir agora
    Entao deve aparecer um pop up com a mensagem "Nao pode transferir pra mesmo conta"
