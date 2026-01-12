Este proyecto contiene una prueba funcional automatizada End-to-End (E2E) sobre la aplicación web
https://www.saucedemo.com/

La prueba E2E cubre los siguientes pasos:
Autenticación con el usuario:
Usuario: standard_user
Password: secret_sauce

Agregar dos productos al carrito
Visualizar el carrito de compras
Completar el formulario de compra
Finalizar la compra
Validar el mensaje de confirmación:
“THANK YOU FOR YOUR ORDER”

Para ejecutar este proyecto en un entorno local se requiere:
Sistema Operativo: Windows 11
Java JDK 1.8 (configurado en variables de entorno)
Maven 3.8.6 o superior (configurado en variables de entorno)
IDE recomendado: IntelliJ IDEA 2023.1 o Visual Studio Code
Navegador: Google Chrome
Conexión a Internet (para descarga de dependencias)

Nota importante:
En el entorno local actual no fue posible ejecutar completamente las pruebas debido a:
Limitaciones de memoria del equipo

Comandos de Instalación
Una vez clonado el repositorio desde GitHub, ejecutar:
mvn clean install -DskipTests

AUTOR
Hallen Lluglla

Sin embargo, el proyecto queda correctamente estructurado y listo para ejecutarse en un entorno adecuado.
