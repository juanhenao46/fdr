# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pago de proveedores
  El usuario debe tener la habilidad para realizar un pago otros bancos e inscribir la cuenta
  @TestCase1
  Esquema del escenario: Pago de proveedores otros bancos inscribir nueva cuenta
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | titular de cuenta | tipo de documento | tipo de cuenta | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <titular de cuenta> | <tipo de documento> | <tipo de cuenta> | <valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a pagos manuales
    Y el usuario selecciona opcion proveedores
    Y el usuario selecciona cuenta origen
    Y el usuario ingresa el detalle del pago
    Y el usuario ingresa un pago a nueva cuenta otros bancos y la inscribe
    Y el usuario envia el lote
    Entonces el usuario deberia poder ver mensaje de transaccion pendiente
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | titular de cuenta | tipo de documento | tipo de cuenta | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/pagos/manuales/PagosManualesInscribirCuenta.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Bancamia S.A.|QA otros bancos| Cédula de ciudadanía |Cuenta de ahorros|500000|
