# language: es
@E2E_iris
Característica: Aplicativo Banco IRIS Crear nuevo rol
  El usuario debe tener la habilidad para crear un nuevo rol
  @TestCase1
  Esquema del escenario: Crear nuevo rol
    Dado que el usuario tiene toda la informacion que necesita
      | nit | usuario | clave | estado rol |
      | <nit> | <usuario> | <clave> | <estado rol> |
    Dado que el usuario se encuentra logueado en el aplicativo Banca Digital
    Cuando el usuario ingresa a roles y limites
    Y el usuario ingresa a crear nuevo rol
    Y el usuario ingresa los datos del rol
    Y el usuario selecciona los productos del rol
    Entonces el usuario deberia poder ver los permisos restricciones y limites por default
    Y el usuario configura los permisos y restricciones del rol
    Y el usuario asigna los usuarios y autorizadores del rol
    Entonces el usuario deberia ver el resumen del rol con la informacion correspondiente
    Y el usuario da clic en siguiente e ingresa otp
    Entonces el usuario deberia poder ver el mensaje de rol creado con exito
    Ejemplos:
      |nit|usuario|clave|estado rol|
      ##@externaldata@./src/test/resources/co.com.dannregional.testing.fdr/datadriver/gestionUsuarios/roles/CrearNuevoRol.xlsx@Datos
	|111111103|admin2automation3|juanfelipehenaolopez|Activo|
	|111111103|admin2automation3|juanfelipehenaolopez|Inactivo|
