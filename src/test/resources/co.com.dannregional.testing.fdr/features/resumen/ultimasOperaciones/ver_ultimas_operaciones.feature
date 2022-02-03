# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS pantalla resumen
  El usuario debe tener la habilidad para ver todas las ultimas operaciones de sus cuentas
  @TestCase1
  Esquema del escenario: Ingresar a las ultimas operaciones de las cuentas
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | texto esperado |
      | <nit> | <usuario> | <clave> | <texto esperado> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario da clic en Ver todo ultimas operaciones
    Entonces el usuario deberia poder ver el detalle de las operaciones
    Ejemplos:
      |nit|usuario|clave|texto esperado|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/resumen/ultimasOperaciones/UltimasOperaciones.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Detalles de operaciones|
