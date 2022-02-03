# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Identificador de cuentas
  El usuario debe tener la habilidad para editar un identificador de cuentas
  @TestCase1
  Esquema del escenario: Editar identificador de cuentas
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario|
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa al menu de administracion
    Y el usuario ingresa a la opcion identificador de cuentas
    Y el usuario edita un identificador de cuentas
    Entonces el usuario deberia poder ver el mensaje de identificador editado con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
