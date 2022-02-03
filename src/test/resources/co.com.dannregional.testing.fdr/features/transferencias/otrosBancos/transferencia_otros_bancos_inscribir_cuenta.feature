# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a cuentas Banco Iris
  El usuario debe tener la habilidad para realizar una transferencia a una cuenta banco iris
  @TestCase1
  Esquema del escenario: Transferencia a otros bancos inscribir nueva cuenta
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | titular de cuenta | tipo de documento | banco | tipo de cuenta | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <titular de cuenta> | <tipo de documento> | <banco> | <tipo de cuenta> |<valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias otros bancos
    Y el usuario inscribe una cuenta de otro banco desde cuenta destino
    Y el usuario completa los campos requeridos para transferir e inscribir la cuenta
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transaccion exitosa
    Ejemplos:
      | nit | usuario | clave | cuenta origen | titular de cuenta | tipo de documento | banco |tipo de cuenta | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/otrosBancos/TransferenciasOtrosBancosNuevaCuenta.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|QA otros bancos|Cédula de ciudadanía|Bancolombia|Cuenta de ahorros|1500000|
