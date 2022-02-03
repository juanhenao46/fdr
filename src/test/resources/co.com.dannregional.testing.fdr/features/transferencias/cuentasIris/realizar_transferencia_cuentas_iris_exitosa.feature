# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a cuentas Banco Iris
  El usuario debe tener la habilidad para realizar una transferencia a una cuenta banco iris
  @TestCase1
  Esquema del escenario: Transferencia a cuentas iris exitosa
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | cuenta destino | valor | mes | dia |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <cuenta destino> | <valor> | <mes> | <dia> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas iris
    Y el usuario completa correctamente los campos requeridos para transferir
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transaccion exitosa
    Ejemplos:
      | nit | usuario | clave | cuenta origen | cuenta destino | valor | mes | dia |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasIris/TransferenciasCuentasIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|QA MANUAL DOS ••••5680|1500000|dic|31|
