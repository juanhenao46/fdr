# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Historico transacciones modal
  El usuario debe tener la habilidad para validar el modal de una transaccion
  @TestCase1
  Esquema del escenario: Modal de una transaccion historico de transacciones
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a historico de transacciones
    Y el usuario abre el detalle de una transaccion del historico
    Entonces el usuario deberia poder validar el modal de la transaccion
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
