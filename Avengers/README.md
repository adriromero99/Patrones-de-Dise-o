# Consignas

* Identifique potenciales problemas de diseño en el código. Enumérelos en una hoja y justifique por qué considera que representan un problema de diseño.
* ¿Se viola algún principio de diseño? ¿Cuál(es)?
* Realice una mejora de diseño total del proyecto que además incluya:
    * Iron Man deberá poder robarle las gemas del infinito a Thanos cuadriplicando él también su poder de ataque pero provocándole una muerte inmediata.
* Puede modificar todo el código (de la solución y de las pruebas), agregando y/o quitando todas las clases que considere apropiadas, justificando cada decisión.

# Respuestas y cambios realizados:

* Se agregó la clase IronMan porque se considera que puede tener responsabilidades de la clase Thanos respetando así el principio de responsabilidad única
* Se utiliza el patrón State para saber si un personaje tiene o no las Gemas del Infinito
* Se utiliza el patrón Decorator para calcular el daño realizado por los escudos. Este patrón resulta útil pues el daño realizado se puede acumular y depende de la cantidad y el 
tipo de escudo equipados.
