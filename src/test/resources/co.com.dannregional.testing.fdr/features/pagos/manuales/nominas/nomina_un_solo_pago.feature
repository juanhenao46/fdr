# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Pago de nominas
  El usuario debe tener la habilidad para realizar un solo pago de nominas
  @TestCase1
  Esquema del escenario: Pago de nominas un solo pago
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <cuenta destino> | <valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a pagos manuales
    Y el usuario selecciona opcion nominas
    Y el usuario selecciona cuenta origen
    Y el usuario ingresa el detalle del pago
    Y el usuario ingresa un pago
    Y el usuario envia el lote
    Entonces el usuario deberia poder ver mensaje de transaccion pendiente
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/pagos/manuales/PagosManualesUnSoloPago.xlsx@Datos
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|Iris|QA MANUAL ••••1548|200000|
