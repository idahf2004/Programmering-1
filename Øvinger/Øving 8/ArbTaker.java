import java.util.GregorianCalendar;

public class ArbTaker {
    private Person personalia;
    private int arbeidstakernr;
    private int ansettelsesaar;
    private double maanedsloenn;
    private double skatteprosent;
    GregorianCalendar kalender = new java.util.GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person personalia, int arbeidstakernr, int ansettelsesaar, double maanedsloenn, double skatteprosent) {
        this.personalia = personalia;
        this.arbeidstakernr = arbeidstakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedsloenn = maanedsloenn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    } 

    public int getArbeidstakernr() {
        return arbeidstakernr;
    }

    public int getAnsattelsesaar() {
        return ansettelsesaar;
    }

    public double getMaanedsloenn() {
        return maanedsloenn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setMaanedsloenn(double newMaanedsloenn) {
        maanedsloenn = newMaanedsloenn;
    }

    public void setSkatteprosent(double newSkatteprosent) {
        skatteprosent = newSkatteprosent;
    }

    public double skatteTrekk() {
        return maanedsloenn * (skatteprosent/100);
    }

    public double bruttoLoennPerAar() {
        return (maanedsloenn - skatteTrekk())*12;
    }

    public double skatteTrekkPerAar() {
        return skatteTrekk()*10.5;
    }

    public String getHeleNavn() {
        return personalia.getEtternavn() + " " + personalia.getFornavn();
    }

    public int getAlder() {
        return aar - personalia.getFoedselsaar();
    }

    public int antallAarAnsatt() {
        return aar - ansettelsesaar;
    }

    public boolean gittAntallAar(int gittAar) {
        if (ansettelsesaar >= gittAar) {
            return true;
        }
        else {
            return false;
        }
    }
}
