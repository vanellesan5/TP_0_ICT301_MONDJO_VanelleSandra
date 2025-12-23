# TP_0_ICT301_MONDJO_NZUKAM_Vanelle_Sandra_25I2283
*nom:* MONDJO NZUKAM 
*prenom:* Vanelle Sandra 
*matricule:* 25I2283

## comprehension des Principes SOLID
les principes SOLID sont cinq principes fondamentaux de le programmation orientée objet qui permettent de concevoir des applicatons robustes, extensibles et maintenables.

## Single Responsability Principle : SRP
une classe = une responsabilité
ici une classe a une et une seule responsabilité; c'est à dire ce la classe sait faire ce quelle doit faire. par exemple une classe book ne doit gerer que les données du livre, et non l'afficher ou la sauvegarder. cela ameliore la cohesion et reduit le couplage. Alors le code devient plus comprehensible, facile à tester et à maintenir.

## Open/Closed Principle : OCP
Ouvert à l'extension, fermé à la modification.
ce principe montre qu'il est possible d'ajouter de nouvelle fonctionnalités sans modifier le code existant. l'utilisation d'abstractions et du polymorphisme permet d'etendre le comportement d'une application. Par exemple, pour ajouter une forme géometrique on n'a pas besoin de modifier la classe AreaCalculator on crée simplement une nouvelle classe qui implemente l'interface shape. Ce principe reduit les risques de regression et facilite l'evolution du code.

## Liskov Substitution Principle : LSP
les sous-classes doivent être substituable 
Ce principe montre qu'une sous-classe doit pouvoir remplacer sa classe parent sans altérer le comportement du programme. Si un carré hérite d'un rectangle il viole les attentes du rectangle (largeur, hauteur). Il garantit la cohérance et la fiabilité du polymorphisme.

## Interface segregation Principle : ISP
prefere les petites interfaces ciblées
Ce principe montre qu'il est preferable d'avoir plusieurs interfaces ciblées plutôt qu'une grande interface monolithique. Par exemple un robot ne devrait pas être obligé d'implementer une methode eat() qu'il ne peut pas utiliser. Ici les classes sont plus coherentes et contrats plus clairs.

## Dependency Inversion Principle : DIP
dépendre des abstractions, pas des implementations
ici les modules de haut niveau ne doivent pas dependre des modules de bas niveau, mais tous les deux doivent dependre des abstractions. les avantages de ce principe : flexibilité, testabilité et réutilisabilité accrues.

## Difference entre la cohésion et le couplage 

*forte cohesion:* les éléments d'un module sont étroitement liés et travaillent avec un objectif commun. cela ameliore la comprehension et la maintenabilité.

*faible couplage:* les modules sont peu dépendants les uns des autres. cela facilite les modifications et la reutilisation.

## Abstraction vs Implementation

*contrat(Abstrsction):* interface stable qui definit les services rendus.

*implementation:* classes concrétes qui peuvent evoluer.

*principes:* toujours dependre des abstractions, pas des implementations concretes.

