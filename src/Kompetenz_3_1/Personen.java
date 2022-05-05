package Kompetenz_3_1;

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
    private String abteilung;

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

public class Personen {
    public static void main (String args []){
        Chef chef = new Chef("Max", "Mustermann", 12313123, "Administration");
        Fachangestellter fachangestellter1 = new Fachangestellter("Klein", "Thomas", 3142314, chef);
        Fachangestellter fachangestellter2 = new Fachangestellter("Meier", "Franz", 988314, chef);
        Person person1 = new Person("Sattler", "Beatrice", 4134231);
    }
}
