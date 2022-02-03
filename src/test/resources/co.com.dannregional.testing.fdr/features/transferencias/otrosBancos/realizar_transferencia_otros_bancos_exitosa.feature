# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a Otros bancos
  El usuario debe tener la habilidad para realizar una transferencia a una cuenta de otros bancos
  @TestCase1
  Esquema del escenario: Transferencia a otros bancos exitosa
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | mes | dia |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <cuenta destino> | <valor> | <mes> | <dia> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias otros bancos
    Y el usuario completa correctamente los campos requeridos para transferir
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transaccion exitosa
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | mes | dia |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/otrosBancos/TransferenciasOtrosBancos.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|1|
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|2|
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|1|
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|2|
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|1|
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|dic|2|
