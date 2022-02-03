# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pagos programados validar filtro
  El usuario debe tener la habilidad para filtrar los pagos programados
  @TestCase1
  Esquema del escenario: Filtrar pagos programados
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion programadas
    Y el usuario ingresa a la pestaña de pagos
    Entonces el usuario deberia poder validar el filtro tipo de pago programado
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
