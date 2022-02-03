# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS pantalla resumen
  El usuario debe tener la habilidad para ver el detalle de su cuenta de ahorros
  @TestCase1
  Esquema del escenario: Ingreso exitoso al detalle de cuenta
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta | texto esperado |
      | <nit> | <usuario> | <clave> | <cuenta> |<texto esperado> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario da clic en una de sus cuentas
    Y el usuario da clic en el ojo para ocultar el saldo
    Entonces el usuario deberia poder ver el detalle de la cuenta y los saldos ocultos
    Ejemplos:
      |nit|usuario|clave|cuenta|texto esperado|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/resumen/detalleDeCuenta/DetalleDeCuenta.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva|QANueva|
