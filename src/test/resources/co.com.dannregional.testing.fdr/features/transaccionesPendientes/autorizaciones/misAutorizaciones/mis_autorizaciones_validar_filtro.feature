# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Mis autorizaciones validar filtro
  El usuario debe tener la habilidad para filtrar mis autorizaciones
  @TestCase1
  Esquema del escenario: Filtrar mis autorizaciones
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion autorizaciones
    Y el usuario ingresa a la pestaña mis autorizaciones
    Entonces el usuario deberia poder validar el filtro operacion
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
