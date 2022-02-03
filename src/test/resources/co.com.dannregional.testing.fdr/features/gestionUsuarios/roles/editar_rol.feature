# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Editar rol
  El usuario debe tener la habilidad para editar un rol
  @TestCase1
  Esquema del escenario: Editar un rol
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | nombre usuario |
      | <nit> | <usuario> | <clave> | <nombre usuario> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a roles y limites
    Y el usuario ingresa a editar un rol
    Y el usuario edita los datos del rol
    Y el usuario edita los productos del rol
    Y el usuario edita los permisos y restricciones del rol
    Y el usuario edita los autorizadores del rol
    Y el usuario guarda los cambios
    Entonces el usuario deberia poder ingresar al rol editado y ver los cambios realizados
    Y el usuario deshace los cambios
    Ejemplos:
      |nit|usuario|clave|nombre usuario|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/autentificacion/AutentificacionIris.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Admin Dos Automatizacion|
