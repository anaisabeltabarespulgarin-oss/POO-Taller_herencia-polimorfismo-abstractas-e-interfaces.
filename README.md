PARTE C.
1. En el main escribe new Vehiculo("XYZ999", 50). Copia el error y explica por qué ocurre.
ya que Vehiculo es una clase abstracta y con las clases abstractas no se pueden crear objetos con la palabra new.

2. Quita temporalmente tarifaPorKm() de Bicicleta. Copia el error, explícalo y deja el método de nuevo.
ya que al ser heredera de una clase abstracta su subclase esta en deber de tomar ese método.

4. Agrega a Vehiculo costoEnvio(double km, boolean urgente): si es urgente cuesta 50 % más. Imprime c1.costoEnvio(10, true) y c1.costoEnvio(10, false). ¿Es sobrecarga o sobrescritura? ¿Por qué?
es sobrecarga ya que tenemos dos métodos con el mismo nombre dentro de una misma jerarquía pero con diferentes parámetros, uno recibe double y el otro recibe double y boolean.

5. En Bicicleta borra el @Override y cambia el nombre del método a describr. Muestra la flota. ¿Qué cambió en la salida, por qué compiló y qué habría pasado con @Override? Déjalo como estaba.
ya que al cambiar el nombre el polimorfismo se rompe al nombrar mostrar() al tener @Override el compilador manda un error advirtiendo que ese método no esta sobreescribiendo correctamente a ningún método de la superclase.

6. Predice la salida sin ejecutar. Luego compruébala.
La salida es:
AAA12A (20 kg), moto de 100 cc
true
false
21600.0
600000.0

PREGUNTAS:
1. ¿Por qué Bicicleta funcionó en mostrar() y en masEconomico() sin cambiar una sola línea de Flota?
por el polimorfismo ya que la flota esta diseñada para aceptar cualquier cosa que sea un vehículo y ya que la bicicleta también hereda de vehículo la flota la acepta sin enterarse que es una clase nueva.
2. ¿Por qué Vehiculo es abstracta y Moto no? ¿Qué pasaría si Moto también lo fuera?
vehiculo es abstracta es como una idea general, en la vida real no existe un objeto especifico llamado vehiculo, mientras que moto si es un objeto especifico que es real y se puede comprar y si moto fuera abstracta no se podría crear un objeto con ella con la palabra new ya que marcaría eror.
3. ¿Por qué Bodega implementa Asegurable pero no hereda de Vehiculo?
ya que bodega no es un vehículo, no se desplaza por la calle, no tiene llantas, etc. por ello no se hereda de vehiculo pero si se le pudo implementar la interfaz asegurable.
4. ¿Qué diferencia hay entre super(placa, capacidadKg) y super.describir()?
la diferencia es que: super(placaen, capacidadKg) se usa solamente al inicio del constructor para enviarle los datos principales a la clase padre, en cambio super.describir() se usa para pedir prestado el texto que el padre ya tenía.
5. Cierre del curso: explica con tus palabras qué es la POO y señala en tu código del taller un ejemplo de cada
pilar: abstracción, encapsulamiento, herencia y polimorfismo.
POO es como una manera de programar donde se divide el código en partes para facilitar la organización del programa, esas partes son: objetos, atributos y métodos.
pilares:
Abstracción: es cuando creamos la clase Vehiculo y su método abstracto tarifaPorKm(), dejando que cada hijo decida el costo exacto a su manera.
Encapsulamiento: sirve para ocultar los datos, los hace privados para protegerlos y que solo se pueda acceder a ellos mediante los métodos públicos get y set.
Herencia: Cuando Moto y Camion ponen extends Vehiculo, heredando automáticamente todos los atributos y métodos de la clase padre para no tener que escribirlos desde cero.
Polimorfismo: Cuando el método describir() se llama igual en todas partes, pero actúa de forma diferente dependiendo de si el objeto es una moto, un camión o una bicicleta.
<img width="1536" height="1024" alt="68a28304-7788-4d49-beaa-5056a9f1bce7" src="https://github.com/user-attachments/assets/eac325d1-aad5-4b60-ab62-d7716e5d29d5" />


   
