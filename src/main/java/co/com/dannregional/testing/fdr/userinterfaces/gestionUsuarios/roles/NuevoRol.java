package co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NuevoRol extends PageObject {

    public static final Target TXT_NOMBRE_ROL = Target.the("Campo nombre del rol").locatedBy("//input[@id='role-name']");
    public static final Target TXT_DESCRIPCION = Target.the("Campo descripcion del rol").locatedBy("//textarea[@id='role-description']");
    public static final Target CHK_ACTIVO_INACTIVO = Target.the("Slider activo/inactivo").locatedBy("//span[@class='c-switch-slider']");

    public static final Target CHK_PRIMER_PRODUCTO = Target.the("Checkbox primer producto").locatedBy("(//label[@class='custom-control-label'])[1]");
    public static final Target CHK_SEGUNDO_PRODUCTO = Target.the("Checkbox segundo producto").locatedBy("(//label[@class='custom-control-label'])[2]");


    public static final Target CHK_PERMISOS_ADMINISTRACION = Target.the("Checkbox permisos Administracion").locatedBy("(//th[@class='custom-checkbox-parent ng-star-inserted'])[6]");

    public static final Target LBL_RESTRICCION_CUENTAS_PROPIAS = Target.the("Combobox restriccion cuentas propias (ilimitado)").locatedBy("(//span[@class='ng-value-label ng-star-inserted'])[1]");
    public static final Target LBL_RESTRICCION_CUENTAS_IRIS = Target.the("Combobox restriccion cuentas iris (maximo)").locatedBy("(//span[@class='ng-value-label ng-star-inserted'])[2]");
    public static final Target LBL_RESTRICCION_OTROS_BANCOS = Target.the("Combobox restriccion otros bancos (maximo)").locatedBy("(//span[@class='ng-value-label ng-star-inserted'])[3]");

    public static final Target LBL_LIMITE_CUENTAS_IRIS = Target.the("Texto limite por día cuentas iris").locatedBy("//td[text()=' Cuentas Iris ']//following::td[@class='ng-star-inserted'][2]");
    public static final Target LBL_LIMITE_OTROS_BANCOS = Target.the("Texto limite por día cuentas otros bancos").locatedBy("//td[text()=' Otros bancos ']//following::td[@class='ng-star-inserted'][2]");

    public static final Target CHK_AUTORIZADOR_CUENTAS_PROPIAS = Target.the("Slider requiere autorizador cuentas propias").locatedBy("(//span[@class='c-switch-slider'])[1]");
    public static final Target CHK_AUTORIZADOR_CUENTAS_IRIS = Target.the("Slider requiere autorizador cuentas iris").locatedBy("(//span[@class='c-switch-slider'])[2]");
    public static final Target CHK_AUTORIZADOR_OTROS_BANCOS = Target.the("Slider requiere autorizador otros bancos").locatedBy("(//span[@class='c-switch-slider'])[3]");

    public static final Target BTN_USUARIO_ASIGNAR = Target.the("Nombre usuario asignar al rol").locatedBy("//div[contains(text(),'Abc  Prueba')]");
    public static final Target BTN_FLECHA_ASIGNAR_USUARIO = Target.the("Flecha para asignar usuario al rol").locatedBy("//i[@class='cil-arrow-right arrow-color']");

    public static final Target DRP_AUTORIZADORES_CUENTAS_PROPIAS = Target.the("Desplegable autorizadores cuentas propias").locatedBy("(//span[@class='ng-arrow-wrapper'])[1]");
    public static final Target DRP_AUTORIZADORES_CUENTAS_IRIS = Target.the("Desplegable autorizadores cuentas iris").locatedBy("(//span[@class='ng-arrow-wrapper'])[2]");
    public static final Target DRP_AUTORIZADORES_OTROS_BANCOS = Target.the("Desplegable autorizadores otros bancos").locatedBy("(//span[@class='ng-arrow-wrapper'])[3]");
    public static final Target BTN_OPCION_ADMINISTRADOR = Target.the("Opcion Administrador").locatedBy("//div[text()=' Administrador ']");
    public static final Target BTN_OPCION_MASTER = Target.the("Opcion Master").locatedBy("//div[text()=' Master ']");
    public static final Target BTN_ELIMINAR_MASTER_AUTORIZADOR = Target.the("X eliminar master autorizador").locatedBy("//span[contains(text(), 'Master')]//following::span[contains(@class, 'ng-value-icon right')][1]");

    public static final Target LBL_NOMBRE_ROL = Target.the("Label nombre del rol").locatedBy("(//div[@class='col-12 col-sm-4 form-group px-0']//following::h6[1])[1]");
    public static final Target LBL_ESTADO_ROL = Target.the("Label estado del rol").locatedBy("(//div[@class='col-12 col-sm-4 form-group px-0']//following::h6[1])[2]");
    public static final Target LBL_DESCRIPCION_ROL = Target.the("Label descripcion del rol").locatedBy("(//div[@class='col-12 col-sm-4 form-group px-0']//following::h6[1])[3]");

    public static final Target LBL_PRIMER_PRODUCTO_ROL = Target.the("Label primer producto del rol").locatedBy("(//div[@class='col-12 form-group px-0']//following::h6[1])[2]");
    public static final Target LBL_SEGUNDO_PRODUCTO_ROL = Target.the("Label segundo producto del rol").locatedBy("(//div[@class='col-12 form-group px-0']//following::h6[1])[3]");

    public static final Target LBL_HORA_INICIO = Target.the("Label hora de inicio").locatedBy("//small[contains(text(),'Hora de inicio')]//following::h6[1]");
    public static final Target LBL_HORA_FINAL = Target.the("Label hora final").locatedBy("//small[contains(text(),'Hora final')]//following::h6[1]");

    public static final Target LBL_PERMISOS_TRANSFERENCIAS = Target.the("Label permisos transferencias").locatedBy("//th[contains(text(),'Transferencias')]");
    public static final Target LBL_PERMISOS_ADMINISTRACION = Target.the("Label permisos administracion").locatedBy("//th[contains(text(),'Administración')]");

    public static final Target LBL_PRIMER_USUARIO_ASIGNADO = Target.the("Label primer usuario asignado").locatedBy("//small[contains(text(),'Usuarios del rol')]//following::h6[1]");

    public static final Target LBL_ADMIN_AUTORIZADOR_ASIGNADO = Target.the("Label Administrador autorizador asignado").locatedBy("(//span[contains(text(),'Administrador')])[1]");
    public static final Target LBL_MASTER_AUTORIZADOR_ASIGNADO = Target.the("Label Master autorizador asignado").locatedBy("(//span[contains(text(),'Master')])[1]");

    public static final Target LBL_ROL_CREADO_CON_EXITO = Target.the("Pop up Rol creado con exito").locatedBy("//div[contains(text(), 'Rol creado con éxito')]");


}
