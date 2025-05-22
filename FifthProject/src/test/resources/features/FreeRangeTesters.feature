Feature: Inicio de Sesión en Saucedemo
  Para poder acceder a la plataforma de Saucedemo
  Como usuario registrado
  Quiero poder ingresar mis credenciales y verificar el acceso

  Scenario: Entrar pagina principal
    Given Entrar pagina principal
    When verificar que hay un texto llamado Estilo de vida
