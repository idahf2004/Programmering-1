import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Oppgaveoversikt oversikt = new Oppgaveoversikt(100);

        oversikt.registrerNyStudent("Kari", 9);
        oversikt.registrerNyStudent("Ola", 10);
        
        while (true) {
            System.out.println("\nHva vil du gjøre med oppgaveoversikten til studentene?");
            System.out.println("1) Gjøre noe med de registrerte studentene");
            System.out.println("2) Registrere en ny student");
            int oenske = input.nextInt();
            input.nextLine();

            switch(oenske) {
                case 1: System.out.println("Hva vil du gjøre med de registrerte studentene?");
                        System.out.println("1) Finne antall registrerte studenter");
                        System.out.println("2) Finne antall oppgaver som en bestemt student har løst");
                        System.out.println("3) Øke antall oppgaver for en bestemt student");
                        int nyttOenske = input.nextInt();
                        input.nextLine();

                        switch(nyttOenske) {
                            case 1: System.out.println("\nAntall registrerte studenter er " + oversikt.getAntStud());
                                    break;
                            case 2: System.out.println("Hvilken student vil du ha antall løste oppgaver til?");
                                    String navn = input.nextLine();
                                    System.out.println("\nAntall oppgaver " + navn + " har løst er " + oversikt.getAntOppg(navn) + "!");
                                    break;
                            case 3: System.out.println("Hvilken student vil du øke antallet oppgaver til?");
                                    String navn2 = input.nextLine();
                                    System.out.print("Hvor mye vil du øke " + navn2 + "s oppgaver med?");
                                    int antall = input.nextInt();
                                    input.nextLine();
                                    oversikt.oekAntOppg(navn2, antall);
                                    System.out.println("\nAntall oppgaver " + navn2 + " har løst er oppdatert, og " + navn2 + " har nå løst " + oversikt.getAntOppg(navn2) + " oppgaver!");
                                    break;
                            default:
                                System.out.println("\nSkriv et tall fra 1-3!");
                                break;
                        }
                        break;
                case 2: System.out.println("Hva heter den nye studenten?");
                        String nyStudent = input.nextLine();
                        System.out.print("Hvor mange oppgaver har " + nyStudent + " gjort?");
                        int antallOppgaver = input.nextInt();
                        input.nextLine();
                        oversikt.registrerNyStudent(nyStudent, antallOppgaver);
                        break;
                case 3: System.out.println("Nå avsluttes programmet!");
                        input.close();
                        break;
                default: System.out.println("Ugydlig valg, prøv igjen!");
            }
        }
    }
}
