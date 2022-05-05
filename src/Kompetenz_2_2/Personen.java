package Kompetenz_2_2;

class Person {
    protected String name;
    protected String vorname;
    protected int personalNummer;

    public Person(String name, String vorname, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }
}

class Chef extends Person {
    String abteilung;

    public Chef(String name, String vorname, int personalNummer, String abteilung) {
        super(name, vorname, personalNummer);
        this.abteilung = abteilung;
    }
}

class Fachangestellter extends Person {
    private Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }
}

class Firma {
     Person[] mitarbeiter;
    public Firma (Person[] p) {
        mitarbeiter = p;
    }
}


public class Personen {
    public static void main (String args []){
        Firma f = new Firma(new Person[] {new Chef("Sattler", "Beatrice",25, "Verkauf")} ); // <== Speicherdiagram
        System.out.println(((Chef)f.mitarbeiter[0]).abteilung);
    }
}
