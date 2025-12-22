package SRP.apres;
// Classe BookBusinessLogic : Logique métier
     class BookBusinessLogic {
 public void emprunter(bookSRP book, String lecteur) {
     System.out.println("\nEmprunt du livre '" + book.getTitle() + "' par " + lecteur); } 
//On peut ajouter d'autres logiques
     public void autreService(bookSRP book) {
     System.out.println("\nAutre logique métier sur le livre '" + book.getTitle());}
 }