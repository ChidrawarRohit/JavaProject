import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		Student student = new Student("Ram , 30");
		/*
		 * Returns: The class object that represents the runtime class of this object.
		 */

		Class<? extends Student> studentClass = student.getClass();

		/*
		 * returns:the array of method objects representing the public methods of this
		 * class
		 */

		Method[] methodArray = studentClass.getMethods();

		for (Method method : methodArray) {

			System.out.println(method.getName());
		}
		System.out.println(".........");

		Field[] fieldArray = studentClass.getDeclaredFields();
		for (Field field : fieldArray) {
			System.out.println(field.getName());
		}
	}
}
