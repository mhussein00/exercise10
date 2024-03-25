import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("baka", "baka@bakamail.com");
        BusinessContact business1 = new BusinessContact("eren", "erenyeager@aot.com", "614-614-614");

        Storage storage = new Storage();
        storage.addPerson(contact1);
        storage.addPerson(business1);

        for(Contact a : storage) {
            a.display();
        }



    }
}
class Contact {
    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public  void display() {
        System.out.println("Their name is: " + name + " Their email is: " + email );
    }
}

class BusinessContact extends Contact {
    String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Their business number is: " + phoneNumber);
    }
}


class Storage implements Iterable<Contact> {
    ArrayList<Contact> s = new ArrayList<>();

    public Storage () {

    }


    public void addPerson(Contact a) {
        s.add(a);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "s=" + s +
                '}';
    }

    @Override
    public Iterator<Contact> iterator() {
        return s.iterator();
    }
}