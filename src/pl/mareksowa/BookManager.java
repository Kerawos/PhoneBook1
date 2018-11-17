package pl.mareksowa;



public class BookManager {

    private Notification not;

    public BookManager() {
        this.not = new Notification();
    }

    public void showContacts(Contact[] contactBook){
        if (contactBook.length==0){
            not.printNoContact();
        } else {
            for (Contact contact : contactBook) {
                not.printContact(contact);
            }
        }
    }

    public boolean canAdd(Contact[] bookName, Contact contactToAdd){
        for (Contact contact : bookName) {
            if (contactToAdd.getName().equals(contact.getName())){
                if (contactToAdd.getSurname().equals(contact.getSurname())){
                    if (contactToAdd.getNumber()==contact.getNumber()){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Contact[] addContact(Contact[] bookName, Contact contactToAdd){
        int recentSize = bookName.length;
        int newSize = recentSize + 1;
        Contact[] newBookName = new Contact[newSize];
        for (int i = 0; i < recentSize; i++) {
            newBookName[i] = bookName[i];
        }
        newBookName[recentSize] = contactToAdd;
        return newBookName;
    }

    public boolean canDel(Contact[] bookName, Contact contactToAdd){
        for (Contact contact : bookName) {
            if (contactToAdd.getName().equals(contact.getName())){
                if (contactToAdd.getSurname().equals(contact.getSurname())){
                    if (contactToAdd.getNumber()==contact.getNumber()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
