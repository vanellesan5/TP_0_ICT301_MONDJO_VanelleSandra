package SRP.apres;

public class Main {
    public static void Main(String[] args) {

        bookSRP Book = new bookSRP("les pricipes SOLID",
         "Etudiants de M1-GL",
          "Revision des principes SOLID pour une architecture logicielle");
          
          bookPrinter printer = new bookPrinter();
          printer.printToScreen(Book);
          printer.printToHTML(Book);

          bookSaver saver = new bookSaver();
          saver.saveToDatabase(Book);
          saver.saveToFile(Book, "solid_book.txt");

          BookBusinessLogic businessLogic = new BookBusinessLogic();
          businessLogic.emprunter(Book, "marcial");
          businessLogic.autreService(Book);


    }
    
}
