# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pago de proveedores guardar y eliminar pago
  El usuario debe tener la habilidad para guardar y eliminar un pago de proveedores
  @TestCase1
  Esquema del escenario: Guardar y eliminar un pago de proveedores
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <cuenta destino> | <valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a pagos manuales
    Y el usuario selecciona opcion proveedores
    Y el usuario selecciona cuenta origen
    Y el usuario ingresa el detalle del pago
    Y el usuario ingresa un pago
    Y el usuario guarda el pago
    Entonces el usuario deberia poder ver mensaje de pago guardado
    Y el usuario elimina el pago
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/pagos/manuales/PagosManualesUnSoloPago.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
