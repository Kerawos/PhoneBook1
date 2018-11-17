package pl.mareksowa;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Notification not;
    private BookManager bookMan;

    public Menu() {
        this.sc = new Scanner(System.in);
        this.not = new Notification();
        this.bookMan = new BookManager();
    }

    public void startBook(){
        String command = "";
        boolean exitApp = true;
        Contact[] bookName = new Contact[0];

        //program work
        do {
            not.printMenuInfo();
            command = sc.next();
            switch (command) {
                case "add": {
                    Contact contact = new Contact();
                    not.printAddName();
                    contact.setName(sc.next());
                    not.printAddSurname();
                    contact.setSurname(sc.next());
                    not.printAddNumber();
                    contact.setNumber(sc.nextInt());
                    if (bookMan.canAdd(bookName, contact)){
                        //bookName = new Contact[bookName.length];
                        bookName = bookMan.addContact(bookName, contact);
                        not.printAddSucces();
                    } else {
                        not.printAddFail();
                    }
                    break;
                }
                case "del": {

                    break;
                }
                case "print":{
                    bookMan.showContacts(bookName);
                    break;
                }
                case "exit": {
                    not.printGoodbye();
                    exitApp = false;
                    break;
                }
                default: {
                    not.printUnknown();
                    break;
                }
            }
        } while (exitApp);
    }


}
