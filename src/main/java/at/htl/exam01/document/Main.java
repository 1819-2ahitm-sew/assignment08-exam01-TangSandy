package at.htl.exam01.document;

public class Main {

    public static void main(String[] args) {
     Book book1 = new Book("Rowlings","Harry Potter und der Stein der Weisen");
     Book book2 = new Book("Tolkien","lordOfTheRings");
     Email email = new Email("Susi", "Bewerbung", "CoolCompany");

     Document[] docs = new Document[]{book1, email, book2};
     int bookCount = 0;
     int emailCount = 0;



        for (int i = 0; i < docs.length; i++) {
            if(docs[i] instanceof Book){
                System.out.print("Book: " + docs[i].toString() + "\n");
                bookCount++;
            } else if(docs[i] instanceof Email){
                System.out.print("Email: " + docs[i].toString()+ "\n");
                emailCount++;
            }
        }

        System.out.println();
        System.out.println("Anzahl Books: " + bookCount);
        System.out.println("Anzahl Email: " + emailCount);

    }


}
