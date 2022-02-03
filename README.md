# Introduccion Automatización Aplicativo DANN REGIONAL.
Descripción: En la siguiente guía encontrara los pasos básicos para la ejecución del artefacto de automatización de DANN REGIONAL

# Herramientas utilizadas:
Descripción: A continuación se dará la descripción de las herramientas utilizadas(necesarias) para la creación y modificación del proyecto de automatización.
1. Descarga e Instalación de java
2. Descarga e Instalación de JDK de java (Ultima version)
3. Descarga e instalación de Git
4. Descarga e Instalación de Source tree
5.  Descarga e Instalación de intell J o Eclipse(Entorno de desarrollo)
6.  Descarga de Gradle
7.  Descarga de Maven


# Construcción y Pruebas
Descripcion: en la presente guia se daran las pautas para la configuracion de un proyecto de automatización con java, Gherkin, Cucumber y patron de diseño Serenity BDD(Scren Play).

1.  Descarga e instalación Plugins de entorno de desarrollo (Gherkin and Cucumber For java).
2.  Descarga e instalacion de plugin Sonar lint (Inspecionador de Codigo en tiempo real).
3.  Configuracion de variable de entorno JAVA_HOME
4.  Configuracion de variable de entorno Gradle
5.  Configuracion de variable de entorno Maven
6.  Configuracion de Source tree para control de versiones mediante Azure o repositorios de git


# Metodologia de Desarrollo o codificación
Descripcion: en el presente apartado se daran la metodologia utilizada para la codificacion de la automatización

# Nombramiento de Clases, Métodos y Atributos
Como estándar de nombramiento se tienen definidas las siguientes reglas que hacen el proyecto mas legible.

# 1. Nombramiento de features:
Estilo Minúsculas: small_caps Todas las palabras en minúsculas, si contiene mas de una palabra cada una debe estar separada por guión bajo "_".

    Ejemplo: realizar_pago_facturas.feature

# 2. Nombramiento Clases:
Estilo Pascal: PascalCase La primera letra de cada palabra (si tiene mas de una) debe ir en mayúscula.

    Ejemplo: RealizarPagoFacturas.class

# 3. Nombramiento Métodos y atributos:
Estilo camelCase: camelCase La primera letra debe estar en minúscula. Si tiene mas de una palabra la primera letra de cada una debe estar en mayúscula

    Ejemplo: pagarFacturaVencida(){} --- public String tipoDocumento

# 4. Nombramiento Constantes:
Estilo Mayúsculas: *ALL_CAPS* Todas las letras del nombre se encuentran en mayúscula y separar cada palabra por guión bajo "_".

    Ejemplo: public static final String CLAVE_USUARIO = "123456"

# 5. Nombramiento de Runners y StepDefinitions :
Los Runners y StepDefinition deben conservar el mismo nombre que se definió en el feature con estilo PascalCase. Al final del nombramiento debe tener la palabra Runner o StepDefinition (en singular) según sea la clase que corresponde.

     Ejemplos:
    
    Runners:    
    ConsultarSaldosConsolidadosRunner
    RealizarTransferenciaCuentasInscritasRunner
    PagarTarjetaCreditoRunner
    
    StepsDefinitions
    ConsultarSaldosConsolidadosStepDefinition
    RealizarTransferenciaCuentasInscritasStepDefinition
    PagarTarjetaCreditoStepDefinition

# Manejo de Ramas en control de versiones
Descripción: en la presente guia se tendra el standar utilizados para el manejo de versiones, el cual
consta de.

1. Rama Master : es la que se utiliza como rama principal donde se encuentra el proyecto en su estado final.
2. Rama Develop : es aquella rama donde convergen las ramas de desarrollo y la rama master que es nuestra rama principal o de producción.
3. Ramas Feature : son aquellas ramas, donde se comenzará un desarrollo de una nueva funcionalidad, es decir que sera un clon de
   desarrollo pero solo para una codificacion en especifico.


Si se desea consultar mas informacion sobre el proceso de automatización o alguna de sus herramientas y/o configuraciones:
- [Serenity BDD ](http://thucydides.info/docs/serenity-staging/)
- [Gherkin and Cucumber](https://cucumber.io/docs/guides/)
- [Variables de entorno](https://www.java.com/es/download/help/path.xml)
- [Mapeo de objetos y Pages](https://www.guru99.com/xpath-selenium.html)
  - 
