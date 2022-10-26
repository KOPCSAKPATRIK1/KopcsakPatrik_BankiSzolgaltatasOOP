package hu.petrik.bejegyzesProjekt;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Tulajdonos tulajdonos = new Tulajdonos("Kopcsak Patrik");

        bank.SzamlaNyitas(tulajdonos,0);

        bank.SzamlaNyitas(tulajdonos,1000);
        System.out.println(bank.getOsszegyenleg(tulajdonos));
        System.out.println(bank.getOsszHitelkeret());
    }
}
