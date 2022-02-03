# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Inscribir cuentas banco Iris
  El usuario debe tener la habilidad para inscribir una cuenta banco iris
  @TestCase1
  Esquema del escenario: Inscripcion de cuentas banco iris exitosa
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
      | <nit> | <usuario> | <clave> | <numero de cuenta> | <tipo de cuenta> | <titular de cuenta> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias inscribir cuentas
    Y el usuario ingresa el numero de cuenta a inscribir y selecciona validar
    Y el usuario concluye y ejecuta la inscripcion
    Entonces el usuario deberia poder ver pop up de inscripcion exitosa
    Y el usuario elimina la cuenta inscrita
    Ejemplos:
      | nit | usuario | clave | numero de cuenta | tipo de cuenta | titular de cuenta |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasInscritas/InscripcionCuentasIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|100605465173|Cuenta de ahorros|QA MANUAL DOS|
