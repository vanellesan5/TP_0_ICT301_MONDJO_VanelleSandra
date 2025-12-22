    package avant;
    
// Utilisation de la classe Book
    public class main {
     public static void main(String[] args) {
     book book = new book("Les principes SOLID", "Etudiants de M1-GL", "Révision desprincipes SOLID");
     book.printToScreen();
    book.saveToDatabase();
    book.emprunter("Marcial");
}
}