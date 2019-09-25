import java.io.*;

class Person implements Serializable{
        public String name = null;
        public int    age  =   0;
    }

public class ObjectInputOutputStreamExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream =
            new ObjectOutputStream(new FileOutputStream("E:\\2019\\Java\\Practical\\Unit 2\\File IO\\serial.txt"));

        Person person = new Person();
        person.name = "Jakob Jenkov";
        person.age  = 40;

        objectOutputStream.writeObject(person);
        objectOutputStream.close();


        ObjectInputStream objectInputStream =
            new ObjectInputStream(new FileInputStream("E:\\2019\\Java\\Practical\\Unit 2\\File IO\\serial.txt"));

        Person personRead = (Person) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}