# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a cuentas Banco Iris inscribir nueva cunta
  El usuario debe tener la habilidad para inscribir una cuenta banco iris en el flujo de la transferencia
  @TestCase1
  Esquema del escenario: Transferencia a cuentas iris inscribir nueva cuenta
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | numero de cuenta | tipo de cuenta | titular de cuenta | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <numero de cuenta> | <tipo de cuenta> | <titular de cuenta> | <valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas iris
    Y el usuario inscribe una cuenta desde cuenta destino
    Y el usuario completa los campos requeridos para transferir e inscribir la cuenta
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transaccion exitosa
    Y el usuario elimina la cuenta inscrita
    Ejemplos:
      | nit | usuario | clave | cuenta origen | numero de cuenta | tipo de cuenta | titular de cuenta | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasIris/TransferenciasCuentasIrisNuevaCuenta.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|100605465173|Cuenta de ahorros|QA MANUAL DOS|1500000|
