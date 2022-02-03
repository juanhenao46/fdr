# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a cuentas propias con usuario operador
  El usuario debe tener la habilidad para realizar una transferencia a una cuenta propia
  @TestCase1
  Esquema del escenario: Transferencia a cuentas propias pendiente de aprobacion
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | cuenta destino | valor |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <cuenta destino> | <valor> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas propias
    Y el usuario completa correctamente los campos requeridos para transferir
    Y el usuario ejecuta la transferencia
    Entonces el usuario deberia poder ver mensaje de transferencia pendiente de aprobacion
    Ejemplos:
      | nit | usuario | clave | cuenta origen | cuenta destino | valor |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasPropias/TransferenciasCuentasPropiasAprobacion.xlsx@Datos
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|
	|111111103|operador2automation3|juanfelipehenaolopez|QANueva ••••0870|PrimeraCta ••••7859|1500000|
