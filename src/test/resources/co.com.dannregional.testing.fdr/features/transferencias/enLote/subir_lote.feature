# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Transferencias a Otros bancos
  El usuario debe tener la habilidad para realizar una transferencia en lote
  @TestCase1
  Esquema del escenario: Transferencia en lote
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | mes | dia |
      | <nit> | <usuario> | <clave> |  <cuenta origen> | <banco destino> | <cuenta destino> | <valor> | <mes> | <dia> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a transferencias en lote
    Y el usuario carga el archivo de lote
    Y el usuario ingresa el detalle del lote
    Ejemplos:
      | nit | usuario | clave | cuenta origen | banco destino | cuenta destino | valor | mes | dia |
          ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/transferencias/otrosBancos/TransferenciasOtrosBancos.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|QANueva ••••0870|Banco AV Villas|QA AV VILLAS ••••4564|1500000|jun|17|
