package at.htl.exam01.document;

public class Book extends Document {
    private String title = "";

    public Book(String author,String title) {
        super(author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String output;
        output = "'" + title + "'" + " von '" + getAuthor() +"'";
        return output;
    }
}
