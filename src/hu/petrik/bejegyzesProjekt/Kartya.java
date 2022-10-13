package hu.petrik.bejegyzesProjekt;

public class Kartya extends BankiSzolgaltatas
{
    private String kartyaszam;
    private Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam )
    {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaszam = kartyaszam;
    }

    public void setKartyaszam(String kartyaszam)
    {
        this.kartyaszam = kartyaszam;
    }
}
