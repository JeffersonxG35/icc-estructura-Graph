## Autor
Leo Vásconez y Jefferson Guerrero

## Versión 3.0.0
El proyecto contiene 4 clases, una de ellas es la clase "main"
-> La clase "User": representa un usuario con atributos name, age, interests, y friends. Además esta contiene algunos métodos como "addFriend(User friend)", "getFriends()" y toString()

-> La clase Graph: Contiene los metodos que realizan lo siguiente:
primero se añade un usuario al grafo, luego se establece una conexión bidireccional entre dos usuarios. 
El método recommendFriends lo que hace es recomendar amigos basándose en los amigos de los amigos.
Y se manda a imprimir todas las conexiones.

-> La clase RecomendationEngine lo que hace es:
 Hacer recomendaciones de amigos basadas en la similitud de intereses entre unos y otros. Con el primer método recomienda amigos que no sean amigos actuales y que tengan intereses similares.
 Y por último, el método "calculateSimilarity(User user1, User user2)" Calcula la similitud entre dos usuarios basada en sus intereses dandonos un valor que es la similitud que un usuario tiene con otro según sus gustos.

-> En la clase "Main" Creamos cinco usuarios con nombres, edades e intereses para cada uno. Añadimos los usuarios creados al grafo. Establecemos conexiones de amistad entre los usuarios. Se imprime las conexiones del grafo para cada usuario. Por último, se sugiere amigos a un usuario basado en intereses similares.

