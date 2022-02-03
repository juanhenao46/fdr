# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Historico pagos modal
  El usuario debe tener la habilidad para validar el modal de un pago
  @TestCase1
  Esquema del escenario: Modal de un pago historico de transacciones
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a historico de transacciones
    Y el usuario ingresa a la pestaña pagos y lotes
    Y el usuario abre el detalle de un pago historico
    Entonces el usuario deberia poder validar el modal del pago
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
