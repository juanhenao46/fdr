# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Autorizaciones pendientes eliminar transaccion desde el checkbox
  El usuario debe tener la habilidad para autorizar una transaccion seleccionando el checkbox
  @TestCase1
  Esquema del escenario: Eliminar autorizacion seleccionando checkbox
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion autorizaciones
    Y el usuario selecciona el checkbox de una autorizacion
    Y el usuario elimina las transacciones seleccionadas con el check
    Entonces el usuario deberia poder ver mensaje de transacciones eliminadas con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIrisOperador.xlsx@Datos
	|111111103|operador2automation3|juanfelipehenaolopez|Operador Dos Automatizacion|
