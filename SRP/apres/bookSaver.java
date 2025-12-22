    package SRP.apres;
    // Classe bookSaver : persistance
     class bookSaver {
     public void saveToDatabase(bookSRP book) {
     System.out.println("\nSauvegarde de '" + book.getTitle() + "' en base de données..."); } 
//On peut ajouter d'autres façons de sauvegarder
     public void saveToFile(bookSRP book, String filename) {
     System.out.println("\nSauvegarde de '" + book.getTitle() + "' dans " + filename); }
}
