# PizzaPatronFabrique
Utilisation du patron fabrique pour la gestion des pizzas.

Supposons qu’il existe trois types de pizza: 
  ▪ Reine 
  ▪ Trois fromages 
  ▪ Oriental 
Supposons que chaque pizza est fabriqué de manière différente au Sénégal, En France et aux USA: 
  ▪ Trois fromage: avec gruyére en France, avec fromage de chévre au Sénégal, sans gruyére et sans fromage de chevre aux USA
  ▪ Pizza Reine: avec jambon de porc en France, sans jambon et avec bacon aux USA et jambon de bœuf au Sénégal; 
  • Pizza Oriental: avec crevette au Senegal, avec gambas et sauce harira aux USA et avec calamars en France.  
 Utilisons la fabrique pour créer un systéme de gestion des pizzas.
 La fabrique (factory method) est un patron de conception créationnel utilisé en programmation orientée objet. 
 Elle permet d'instancier des objets dont le type est dérivé d'un type abstrait. La classe exacte de l'objet n'est donc pas connue par 
 l'appelant.
Plusieurs fabriques peuvent être regroupées en une fabrique abstraite permettant d'instancier des objets dérivant de plusieurs types 
abstraits différents.
