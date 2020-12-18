# Consignas

* Identifique potenciales problemas de diseño en el código. Enumérelos en una hoja y justifique por qué considera que representan un problema de diseño.
* ¿Se viola algún principio de diseño? ¿Cuál(es)?
* Realice una mejora de diseño total del proyecto para incluir:

 		Un MASTER CHEFF que sea también capaz de preparar comida para HIPERTENSOS, el mismo sabe hacer tanto panes y empanadas en todas sus variantes:
 			* pan
 			* empanada
 			* pan para celiacos
 			* empanada para celiacos
 			* pan para hipertensos (SIN SAL)
 			* empanada para hipertensos (SIN SAL)
		ACLARACIÓN: los productos SIN SAL tienen un 10% menos de calorias que sus pares con SAL (o sea los comunes o celíacos).
		
* Puede modificar todo el código (de la solución y de las pruebas), agregando y/o quitando todas las clases que considere apropiadas, justificando cada decisión.

# Respuestas y cambios realizados

* Existen muchas clases de Empanadero y Panadero lo que viola el principio de programar contra interfaces y no contra implementaciones, esto puede solucionarse si se utiliza el 
patrón Strategy y se crean estrategias (interfaces) que encapsulen el comportamiento deseado.
* Es posible utilizar el patron Double Dispatch entre la persona que come un producto y el producto que es comido, esto permite crear clases que encapsulan el comportamiento 
esperado cuando una persona come determinado tipo (para celiacos, para hipertensos, normal) de producto.
* La Persona tiene demasiadas responsabilidades lo cual viola el principio de responsabilidad única. Para resolver esto se crearon más clases con parte del comportamiento de 
la clase Persona.

