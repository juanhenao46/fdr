# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Detalle cuenta inscrita
  El usuario debe tener la habilidad para ver el detalle de una cuenta inscrita
  @TestCase1
  Esquema del escenario: Ver detalle de cuenta inscrita
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
      | <nit> | <usuario> | <clave> | <numero de cuenta> | <tipo de cuenta> | <titular de cuenta> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas inscritas
    Y el usuario busca una cuenta en el filtro
    Y el usuario ingresa al detalle de la cuenta inscrita
    Entonces el usuario deberia poder ver el detalle de la cuenta inscrita
    Ejemplos:
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasInscritas/DetalleCuentaInscrita.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|100428321548|Cuenta de ahorros|QA MANUAL|
