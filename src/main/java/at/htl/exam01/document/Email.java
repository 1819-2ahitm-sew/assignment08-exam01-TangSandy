package at.htl.exam01.document;

public class Email extends Document {
    private String name = "Susi";
    private String anliegen = "Bewerbung";
    private String firma = "CoolCompany";


    public  Email(){
        super();
    }

    public void setEmail(){
        this.name = name;
        this.anliegen = anliegen;
        this.firma = firma;
    }

    public String getName(){
        return name;
    }

    public String getAnliegen(){
        return anliegen;
    }

    public String getFirma(){
        return firma;
    }
}
