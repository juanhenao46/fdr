# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Notificaciones
  El usuario debe tener la habilidad para activar y desactivar las notificaciones
  @TestCase1
  Esquema del escenario: Activar y desactivar notificaciones
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario|
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa al menu de administracion
    Y el usuario ingresa a la opcion notificaciones
    Y el usuario activa una notificacion
    Y el usuario desactiva una notificacion
    Entonces el usuario deberia poder ver el pop up de notificaciones actualizadas con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
