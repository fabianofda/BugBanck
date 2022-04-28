#language: pt
Funcionalidade: Fazer login
  Como usuario do bugbank, quero fazer transferências e pagamentos 
  no app com sucesso em um cenário quase real!

  Cenario: Deve fazer login com sucesso
    Dado que desejo realiza login
    Quando informo credenciais validas
    Entao devo ver a area logada

  Cenario: Tentativa de login com email invalido
    Dado que desejo realiza login
    Quando informo email invalido
    Entao devo ver a mensagem alerta

  Cenario: Tentativa de login com senha invalido
    Dado que desejo realiza login
    Quando informo senha invalida
    Entao devo ver a popup de alerta

  Cenario: Tentativa de login campos em branco
    Dado que desejo realiza login
    Quando nao informo nenhum campo
    Entao devo ver as mensagems alertas
