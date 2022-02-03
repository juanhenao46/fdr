# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Buscar cuenta inscrita
  El usuario debe tener la habilidad para buscar una cuenta inscrita en los filtros
  @TestCase1
  Esquema del escenario: Buscar cuenta inscrita en los filtros
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
      | <nit> | <usuario> | <clave> | <numero de cuenta> | <tipo de cuenta> | <titular de cuenta> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias cuentas inscritas
    Y el usuario busca una cuenta en el filtro
    Entonces el usuario deberia poder ver la cuenta en el listado de cuentas inscritas
    Ejemplos:
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasInscritas/DetalleCuentaInscrita.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|100428321548|Cuenta de ahorros|QA MANUAL|
