# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Inscribir cuentas otros banco
  El usuario debe tener la habilidad para inscribir una cuenta de otro banco
  @TestCase1
  Esquema del escenario: Inscripcion de cuentas otros bancos exitosa
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | titular de cuenta | tipo de documento | banco | tipo de cuenta |
      | <nit> | <usuario> | <clave> | <titular de cuenta> | <tipo de documento> | <banco> | <tipo de cuenta> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias inscribir cuentas
    Y el usuario selecciona opcion otros bancos
    Y el usuario completa los datos del titular y de la cuenta
    Y el usuario concluye y ejecuta la inscripcion
    Entonces el usuario deberia poder ver pop up de inscripcion exitosa
    Ejemplos:
      | nit | usuario | clave | titular de cuenta | tipo de documento | banco | tipo de cuenta |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/cuentasInscritas/InscripcionOtrosBancos.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QA otros bancos| Cédula de ciudadanía |Bancamia|Cuenta de ahorros|
