package at.htl.exam01.document;

public class Email extends Document {
    private String subject = "";
    private String to ="";

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        String output = "";

        output = "'" + subject + "'" + " von '" + getAuthor() + "' an '" + to +"'";


        return output;
    }
}
