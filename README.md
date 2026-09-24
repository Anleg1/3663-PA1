# 3663-PA1
# Sistema de Gestión de Inventario - Microempresa

## Descripción Breve
Este proyecto es una aplicación interactiva por consola programada en Java, diseñada para ayudar a una microempresa a gestionar sus artículos. El sistema permite registrar productos, mostrar el inventario, realizar ventas con validación de stock y calcular los ingresos totales.

## 👥 Integrantes del Equipo
- [Tu Nombre Completo]
- [Nombre de tu Compañero]

## 🛠️ Decisiones Técnicas y Modelado de la Solución
Para resolver este caso aplicando únicamente los temas del sílabo hasta la Semana 4, tomamos las siguientes decisiones:

1. **Programación Orientada a Objetos (POO):** 
   Creamos la clase `Producto` como el molde de nuestros datos. Protegimos la lógica de la tienda implementando el método `vender()` con un valor de retorno `boolean`. Esto nos permite rechazar ventas (`return false`) si el usuario pide más unidades de las que hay en stock, evitando inventarios negativos.

2. **Manejo de Memoria (Sin Arreglos):** 
   Como aún no hemos visto arreglos (arrays) ni listas, instanciamos tres variables independientes de tipo `Producto` inicializadas en `null`. Usamos condicionales `if-else` para verificar si están vacías antes de guardar o mostrar información.

3. **Estructuras de Control:** 
   Utilizamos un bucle `do-while` para mantener el menú principal activo continuamente. Para evaluar la opción que el usuario ingresa por teclado (usando la clase `Scanner`), implementamos una estructura `switch-case`.

4. **Contadores y Acumuladores:** 
   Cumpliendo con los temas de la semana, creamos la variable contador `contadorProductos` para saber cuántos espacios hemos llenado, y la variable acumuladora `acumuladorVentas` para sumar el dinero exacto de las transacciones que fueron exitosas.

## 🚀 Instrucciones de Ejecución
1. Clonar o descargar este repositorio.
2. Abrir el proyecto utilizando el entorno de desarrollo **IntelliJ IDEA**.
3. Dirigirse a la ruta: `src/main/java/com/lideratec/Main.java`.
4. Ejecutar el archivo `Main.java` (botón Play / Run).
5. Interactuar con el menú escribiendo las opciones numéricas en la consola inferior.
