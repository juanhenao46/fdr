# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS ¿Olvido su contraseña?
  El usuario debe tener la habilidad para recuperar su contraseña
  @TestCase1
  Esquema del escenario: Recuperacion exitosa de contraseña Banca Digital
    Dado que el usuario tiene toda la informacion que necesita
      | nit | documento | usuario | correo |
      | <nit> | <documento> | <usuario> | <correo> |
    Dado que el usuario se encuentra en el aplicativo Banca Digital
    Cuando el usuario selecciona olvidaste tu contraseña e ingresa los datos
    Entonces el usuario deberia poder ver el mensaje de confirmacion
    Ejemplos:
      | nit | documento | usuario | correo |
    ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/OlvidoContraseñaIRIS.xlsx@Datos
	|111111103|40892333|operadorautomation3|notificapruebasdann+ope.automation3@gmail.com|
