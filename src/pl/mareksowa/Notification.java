package pl.mareksowa;

public class Notification {

    private String lineStarter = ">";

    public void print(String toPrint){
        System.out.println(toPrint);
    }

    public void printWelcome(){
        print(lineStarter + "Witaj w Ksiazce telefonicznej!");
    }

    public void printGoodbye(){
        print(lineStarter + "Dziekujemy za korzystanie z ksiazki!");
    }

    public void printMenuInfo(){
        print(lineStarter + "aby dodac kontakt wpisz do konsoli 'add', aby usunac 'del' aby " +
                "wyswietlic kontakty 'print', aby wyjsc z ksiazki 'exit'");
    }

    public void printUnknown(){
        print(lineStarter + "niezrozumiala komenda");
    }

    public void printAddName(){
        print(lineStarter + "DODAWANIE, wypisz imie");
    }

    public void printAddSurname(){
        print(lineStarter + "DODAWANIE, wypisz nazwisko");
    }

    public void printAddNumber(){
        print(lineStarter + "DODAWANIE, wypisz numer");
    }

    public void printAddSucces(){
        print(lineStarter + "kontakt dodany");
    }

    public void printAddFail(){
        print(lineStarter + "niestety kontakt nie dodany, nie dodajemy powtorzen");
    }

    public void printContact(Contact con){
        print(lineStarter + con.getName() + " " + con.getSurname() + ": " + con.getNumber());
    }

    public void printNoContact(){
        print("Ksiaza nie posiada zednych kontaktow");
    }

}
