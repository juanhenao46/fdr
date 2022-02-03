# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Barra de Navegación
  El usuario debe tener la habilidad para ingresar a las funcionalidades de la barra de navegación
  @TestCase1
  Esquema del escenario: Ingreso exitoso a las funcionalidades de la barra de navegación
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | funcionalidad | texto esperado |
      | <nit> | <usuario> | <clave> | <funcionalidad> |<texto esperado> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario accede a las funcionalidades de la barra de navegacion
    Entonces el usuario deberia poder ver las opciones de cada funcionalidad
    Ejemplos:
      | nit | usuario | clave | funcionalidad | texto esperado |
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/barraNavegacion/FuncionalidadesNavBar.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Resumen|IRIS el Neobanco de las empresas y negocios|
	|111111103|admin2automation3|juanfelipehenaolopez|Transferencias|Seleccione el tipo de transferencia que desea realizar|
	|111111103|admin2automation3|juanfelipehenaolopez|Pagos|Seleccione el tipo de pago a realizar|
	|111111103|admin2automation3|juanfelipehenaolopez|Transacciones pendientes|Seleccione el tipo de transacción que desea comprobar|
	|111111103|admin2automation3|juanfelipehenaolopez|Historico de transacciones|Tipo de transferencia|
	|111111103|admin2automation3|juanfelipehenaolopez|Gestion de usuarios|Seleccione la opción que desea|
	|111111103|admin2automation3|juanfelipehenaolopez|Administracion|Seleccione la opción que desea|
