# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Cambiar contraseña
  El usuario debe tener la habilidad para cambiar su contraseña
  @TestCase1
  Esquema del escenario: Cambio de contraseña
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave |
      | <nit> | <usuario> | <clave> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa al menu de administracion
    Y el usuario ingresa a la opcion cambiar contraseña
    Y el usuario completa correctamente los campos para cambiar contraseña
    Entonces el usuario deberia poder ver el mensaje de cambio de contraseña exitoso
    Ejemplos:
      | nit | usuario | clave |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/administracion/cambiarContraseña/CambiarContraseña.xlsx@Datos
	|111111103|juanhenao3|juanfelipehenaolopez2920|
