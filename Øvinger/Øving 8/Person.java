public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int foedselsaar;

    public Person(String fornavn, String etternavn, int foedselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.foedselsaar = foedselsaar;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFoedselsaar() {
        return foedselsaar;
    }
}

