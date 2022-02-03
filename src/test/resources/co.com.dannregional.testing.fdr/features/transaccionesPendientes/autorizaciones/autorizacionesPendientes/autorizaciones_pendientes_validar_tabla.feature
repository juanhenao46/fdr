# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Autorizaciones pendientes validar tabla con informacion
  El usuario debe tener la habilidad para validar tabla con informacion de autorizaciones pendientes
  @TestCase1
  Esquema del escenario: Tabla con informacion autorizaciones pendientes
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion autorizaciones
    Entonces el usuario deberia poder validar la tabla con informacion de autorizaciones pendientes
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIrisOperador.xlsx@Datos
	|111111103|operador2automation3|juanfelipehenaolopez|Operador Dos Automatizacion|
