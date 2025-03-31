EL patron factory es un patron de diseño creacional el cual se utiliza para crear objetos sin especificar la clase exacta del objeto que se va a crear.
El propósito principal de este patron es delegar la responsabilidad de la creación de objetos a una clase especializada (la “fabrica”),
en lugar de crear instancias de objetos directamente dentro de código cliente. De este modo, se logra un desacoplamiento entre el cliente
y las clases concretas de los objetos de os objetos que se desean crear.

El patron factory se basa en una interfaz común o clase abstracta que define el contrato para los objetos que serán creados. 
Luego, las clases concretas implementan esta interfaz y proporcionan detalles específicos sobre como deben ser creados esos objetos. 
La “fabrica” es la responsable de instanciar y devolver el objeto adecuado según una condición o tipo especificado. 

El patron factory aplicado simula la conexión entre varias base de datos, como Oracle, SQL, MySQL, etc. Iniciando con IConexion el cual define dos métodos (“conectar(), 
y desconectar()”). Estos implementaran métodos de manera especificar para cada tipo de base de datos.
Tambien están las clases concretas de conexión las cuales son (conexionMySQL, ConexionOracle, etc.) esto implementa la interfaz IConexion y proporciona una implementación 
de los métodos conectar() y desconectar() para a base de datos especifica.
El resto de cases de conexión (ConexionOracle, Conexión Postgre, ConexionSQLServer, etc.) son similares y proporcionan implementación de IConexion para sus respectivas 
bases de datos
La case conexiónFabrica tiene un método getConexion(string tipo), que es la fabrica para crear instancias de clases que implementan la interfaz IConexion.
Según el tipo de base de datos (pasado como parámetro en el argumento tipo), la fabrica devuelve una instancia especifica de la clase correspondiente 
como (ConexionOracle, ConexionMYSQL, etc).
Tambien si no se encuentra, este lanzara un excepción indicando que la base de datos no esta soportada.
Tambien la clase app la cual contiene el main() donde se crean varias instancias de conexión usando la fabrica ConexionFabrica.
Cada vez que se llama a getCOnexion(“tipo”), la fabrica devuelve una nueva instancia de la clase correspondiente a esa base de datos.
Y después de obtener la conexión, se invocan los métodos conectar() y desconectar() sobre cada instancia para simular la conexión y desconexion a la base de datos.
