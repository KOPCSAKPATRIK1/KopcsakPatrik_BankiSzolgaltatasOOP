package hu.petrik.bejegyzesProjekt;

public class Szamla extends BankiSzolgaltatas
{
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos)
    {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg()
    {
        return this.aktualisEgyenleg;
    }

    public void befizet(int osszeg)
    {
        this.aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg)
    {
        return false;
    }

    public Kartya ujKartya(String kartyaSzam)
    {
        Kartya kartya = new Kartya(getTulajdonos() ,kartyaSzam, String);
            return ;
    }

}
