# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias programadas eliminar transferencia desde el modal de detalle
  El usuario debe tener la habilidad para eliminar una transferencia programada desde el modal de detalle
  @TestCase1
  Esquema del escenario: Eliminar transferencia programada desde modal de detalle
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion programadas
    Y el usuario abre el detalle de una transferencia programada
    Y el usuario elimina la programacion desde el modal
    Entonces el usuario deberia poder ver mensaje de transaccion eliminada con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
