# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Etiquetas de identificacion
  El usuario debe tener la habilidad para editar una etiqueta de identificaicon
  @TestCase1
  Esquema del escenario: Edicion de etiqueta de identificacion
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario|
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa al menu de administracion
    Y el usuario ingresa a la opcion etiquetas de identificacion
    Y el usuario edita una etiqueta de identificacion
    Entonces el usuario deberia poder ver el mensaje de etiqueta editada con exito
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
