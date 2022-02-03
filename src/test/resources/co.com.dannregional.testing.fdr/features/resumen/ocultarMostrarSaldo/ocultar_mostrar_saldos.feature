# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS pantalla resumen
  El usuario debe tener la habilidad para ocultar y mostrar el saldo de sus cuentas
  @TestCase1
  Esquema del escenario: Ocultar y Mostrar los saldos de las cuentas
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario da clic en el ojo para ocultar el saldo
    Entonces el usuario deberia poder ver los saldos ocultos
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
