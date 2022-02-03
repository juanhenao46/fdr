# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a cuentas propias
  El usuario debe tener la habilidad para programar una transferencia a una cuenta propia
  @TestCase1
  Esquema del escenario: Programar transferencia a cuentas propias exitosa
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | cuenta destino | valor | mes | dia |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <cuenta destino> | <valor> | <mes> | <dia> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas propias
    Y el usuario completa los campos requeridos para programar la transferencia
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transaccion exitosa
    Ejemplos:
      | nit | usuario | clave | cuenta origen | cuenta destino | valor | mes | dia |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasPropias/TransferenciasCuentasPropias.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|dic|31|
