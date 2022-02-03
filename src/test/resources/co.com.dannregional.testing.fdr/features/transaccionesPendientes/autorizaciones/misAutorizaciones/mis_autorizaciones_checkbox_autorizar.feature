# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Mis autorizaciones autorizar transaccion desde el checkbox
  El usuario debe tener la habilidad para autorizar una transaccion seleccionando el checkbox
  @TestCase1
  Esquema del escenario: Autorizar transaccion seleccionando checkbox
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion autorizaciones
    Y el usuario ingresa a la pestaña mis autorizaciones
    Y el usuario selecciona el checkbox de una autorizacion
    Y el usuario autoriza las transacciones seleccionadas
    Entonces el usuario deberia poder ver mensaje de transacciones autorizadas con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
