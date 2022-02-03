# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Intentar editar rol master
  El usuario debe tener la habilidad para validar que el rol master no se pueda editar
  @TestCase1
  Esquema del escenario: Intentar editar rol master
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a roles y limites
    Y el usuario ingresa al rol master
    Entonces el usuario deberia poder ver que el boton editar no esta presente
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
