Feature: Verificar elementos dropdown menu
  Para poder acceder a la plataforma de Saucedemo
  Como usuario registrado
  Quiero poder ingresar mis credenciales y verificar el acceso

    Scenario: Verificar si los elementos existen en un dropdown
    Given Navego a la página de inicio de sesión de Saucedemo
    When Ingreso el nombre de usuario standard_user
    And Ingreso la contraseña secret_sauce
    And Hago clic en el botón de Login
    Then Verificar que los elementos en el dropdown existan
