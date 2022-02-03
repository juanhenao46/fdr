# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Logueo de usuario
  El usuario debe tener la habilidad para loguearse en el portal Banca Digital
  @TestCase1
  Esquema del escenario: Autentificacion exitosa Banca Digital
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra en el aplicativo Banca Digital
    Cuando el usuario se autentifica con sus credenciales
    Entonces el usuario deberia poder ver su nombre en el header y la informacion del dashboard
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
