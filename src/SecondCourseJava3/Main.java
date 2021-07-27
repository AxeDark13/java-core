package SecondCourseJava3;

import java.security.cert.CertificateParsingException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main1(String[] args) {
        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());

        System.out.println(contact1.equals(contact2));
    }

    public static void main2(String[] args) {
        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);

        System.out.println(contacts.contains(contact2));
        System.out.println(contacts.indexOf(contact2));

        contacts.remove(contact2);
        System.out.println(contacts.size());
    }

    public static void main3(String[] args) {
        HashSet<Contact> contacts = new HashSet<>();

        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "+380681234136");

        contacts.add(contact1);
        contacts.add(contact2);
        System.out.println(contacts.size());
    }

    public static void main4(String[] args) {
        HashSet<Contact> contacts = new HashSet<>();

        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        contacts.add(contact1);

        //---------------------------------

        Contact contact2 = new Contact(124, "Vasiliy", "+3806812343416");

        contacts.remove(contact2);
        contacts.add(contact2);

        System.out.println(contacts);
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact(124, "Vasiliy", "+380681234136");
        HashMap<Contact, String> addressMap = new HashMap<>();
        addressMap.put(contact1, "Ukraine, Odessa, Filatova str. 10 - 25");

        contact1.phone = "+380123234136";

        System.out.println(addressMap.get(contact1));
        System.out.println(addressMap.entrySet());

        contact1.phone = "+380681234136";

        System.out.println(addressMap.get(new Contact(123, "Vasiliy", "+380681234136")));
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Contact)) return false;

            Contact contact = (Contact) o;

            if(id != contact.id) return false;
            if(name != null ? !name.equals(contact.name) : contact.name != null) return false;
            return phone != null ? phone.equals(contact.phone) : contact.phone == null;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            return result;
        }
    }
}
