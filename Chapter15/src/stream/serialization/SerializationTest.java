package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Person implements Serializable {
//	
//	private static final long serialVersionUID = -8979042624550852984L;
//	
//	String name;
//	transient String title;
//	public Person() {}
//	public Person(String name, String title) {
//		this.name = name;
//		this.title = title;
//	}
//	public String toString() {
//		return name + "," + title;
//	};
//}

class Person implements Externalizable{
//	
	String name;
	transient String title;
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	public String toString() {
		return name + "," + title;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 쓰는 곳
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 읽는 곳
	};
} 

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException{
		
		Person personLee = new Person("Lee","Manager");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			
		}catch (IOException e) {
		System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		}catch (IOException e) {
		System.out.println(e);
		}
		
	}

}
