Feature: Registro en la opcion de TextBox

    Proces de automatización de registo
    en la opción de TextBox

    Scenario: Ingreso correcto al Formulario
    Given Que el usuario esta en la pagina princial
    When El usuario da clic en la opción de Elements
    And El sistema muestra el mensaje correcto
    Then Ingrasa al formulario de TextBox

    Scenario Outline: Permite llenar el formulario correctamente
    Given Que el usuario esta en la pagina princial
    When El usuario da clic en la opción de Elements
    And El sistema muestra el mensaje correcto
    Then Ingrasa al formulario de TextBox
    And El usuario ingresa el nombre completo "<Nombre>"
    And El usuario Ingresa el Correo "<Correo>"
    And El usuario ingresa la direccion "<Direccion>"
    And El usuario ingresa Permanent direccion "<Direccion Permanente>"
    Then El usuario da clic en boton submit

     Examples: 
            | Nombre | Correo | Direccion | Direccion Permanente |
            | Juan | edward@test.com | Calle 127 #19-43| Calle 127 # 85-25 |
            | Micahel Perez | michael@test.com | Calle 19 #45-03| Calle 129 # 19-25 |
            | Harry Potter | harry@test.com | carrera 19 # 127-35| carrera 19 # 127-35 |