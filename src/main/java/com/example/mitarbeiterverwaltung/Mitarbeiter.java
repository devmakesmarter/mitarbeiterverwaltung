package com.example.mitarbeiterverwaltung;

public class Mitarbeiter {

    private Long id;        // nur Platzhalter, noch ohne Logik
    private String vorname;
    private String name;

    // Leerer Konstruktor (brauchen wir oft in Java)
    public Mitarbeiter() { }

    // Kleiner Komfort-Konstruktor
    public Mitarbeiter(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }

    // Getter/Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
