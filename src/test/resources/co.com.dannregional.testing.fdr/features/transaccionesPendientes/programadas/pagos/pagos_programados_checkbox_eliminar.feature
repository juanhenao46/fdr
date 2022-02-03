# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pagos programados eliminar pago desde el checkbox
  El usuario debe tener la habilidad para eliminar un pago programado seleccionando el checkbox
  @TestCase1
  Esquema del escenario: Eliminar pago programado seleccionando checkbox
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion programadas
    Y el usuario ingresa a la pestaña de pagos
    Y el usuario selecciona el checkbox de un pago programado
    Y el usuario elimina la programacion
    Entonces el usuario deberia poder ver mensaje de transaccion eliminada con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
