# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pago de proveedores
  El usuario debe tener la habilidad para realizar un pago de proveedores con dos pagos
  @TestCase1
  Esquema del escenario: Pago de proveedores dos pagos
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | banco destino 2 | cuenta destino 2 |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <cuenta destino> | <valor> |  <banco destino 2> | <cuenta destino 2> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a pagos manuales
    Y el usuario selecciona opcion proveedores
    Y el usuario selecciona cuenta origen
    Y el usuario ingresa el detalle del pago
    Y el usuario ingresa dos pagos
    Y el usuario envia el lote
    Entonces el usuario deberia poder ver mensaje de transaccion pendiente
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | banco destino 2 | cuenta destino 2 |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/pagos/manuales/PagosManualesDosPagos.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|500000|Banco AV Villas|QA AV VILLAS ••••4564|
