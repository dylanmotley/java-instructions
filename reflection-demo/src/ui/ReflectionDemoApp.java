package ui;

import java.lang.reflect.Field;

import business.Person;

public class ReflectionDemoApp {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Object person = new Person("Bill Smith", 35);
		Field[] fields = person.getClass().getDeclaredFields();
		
		for(Field field: fields) {
			System.out.println("Field name: "+field.getName());
			System.out.println("Field toString: "+field.toString());
		}
		
//		System.out.println("Name Field: ");
//		Field f1 = person.getClass().getField("Name");
//		System.out.println("Name Type: "+f1.getType().getName());

	}

}
