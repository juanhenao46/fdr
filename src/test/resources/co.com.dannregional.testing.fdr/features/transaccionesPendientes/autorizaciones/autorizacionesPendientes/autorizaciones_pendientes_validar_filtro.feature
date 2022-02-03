# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Autorizaciones pendientes validar filtro
  El usuario debe tener la habilidad para filtrar en autorizaciones pendientes
  @TestCase1
  Esquema del escenario: Filtrar autorizaciones pendientes
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transacciones pendientes
    Y el usuario selecciona opcion autorizaciones
    Entonces el usuario deberia poder validar el filtro operacion
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIrisOperador.xlsx@Datos
	|111111103|operador2automation3|juanfelipehenaolopez|Operador Dos Automatizacion|
