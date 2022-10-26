package hu.petrik.bejegyzesProjekt;

public class Kartya extends BankiSzolgaltatas
{
    private String kartyaSzam;
    private Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam)
    {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam()
    {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg)
    {
        if (this.szamla.aktualisEgyenleg>=osszeg)
        {
            this.szamla.aktualisEgyenleg-=osszeg;
            return true;
        }
        else
        {
            return false;
        }
    }


}
