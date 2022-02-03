# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias programadas validar tabla con informacion
  El usuario debe tener la habilidad para validar la tabla con informacion de transferencias programadas
  @TestCase1
  Esquema del escenario: Tabla con informacion transferencias programadas
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion programadas
    Entonces el usuario deberia poder validar la tabla con informacion de transferencias programadas
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
