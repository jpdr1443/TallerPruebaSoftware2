Feature: Inicio de Sesión en Saucedemo
  Para poder acceder a la plataforma de Saucedemo
  Como usuario registrado
  Quiero poder ingresar mis credenciales y verificar el acceso

  Scenario: Inicio de sesión fallido en Saucedemo
    Given Navego a la página de inicio de sesión de Saucedemo
    When Ingreso el nombre de usuario locked_out_user
    And Ingreso la contraseña secret_sauce
    And Hago clic en el botón de Login
    Then Debería mostrar un mensaje de error de inicio de sesión