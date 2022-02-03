# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS pantalla resumen
  El usuario debe tener la habilidad para filtrar por días el saldo total,
  el resumen de saldo y por productos
  @TestCase1
  Esquema del escenario: Filtrar saldo y resumenes por 1, 7, 15, 30 y 45 dias
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | dias | producto |
      | <nit> | <usuario> | <clave> | <dias> | <producto> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario filtra sus saldos por dias
    Entonces el usuario deberia poder ver el filtro cambiado
    Ejemplos:
      |nit|usuario|clave|dias|producto|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/resumen/filtrarSaldos/ResumenSaldos.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|1 Día|Saldo total|
	|111111103|admin2automation3|juanfelipehenaolopez|15 Días|Saldo total|
	|111111103|admin2automation3|juanfelipehenaolopez|30 Días|Saldo total|
	|111111103|admin2automation3|juanfelipehenaolopez|45 Días|Saldo total|
	|111111103|admin2automation3|juanfelipehenaolopez|1 Día|Resumen del saldo|
	|111111103|admin2automation3|juanfelipehenaolopez|15 Días|Resumen del saldo|
	|111111103|admin2automation3|juanfelipehenaolopez|30 Días|Resumen del saldo|
	|111111103|admin2automation3|juanfelipehenaolopez|45 Días|Resumen del saldo|
	|111111103|admin2automation3|juanfelipehenaolopez|1 Día|Resumen por producto|
	|111111103|admin2automation3|juanfelipehenaolopez|15 Días|Resumen por producto|
	|111111103|admin2automation3|juanfelipehenaolopez|30 Días|Resumen por producto|
	|111111103|admin2automation3|juanfelipehenaolopez|45 Días|Resumen por producto|
