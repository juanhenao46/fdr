# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Historico pagos filtro
  El usuario debe tener la habilidad para filtrar el historico de pagos
  @TestCase1
  Esquema del escenario: Filtrar historico de pagos
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a historico de transacciones
    Y el usuario ingresa a la pestaña pagos y lotes
    Entonces el usuario deberia poder validar el filtro tipo de pago
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
