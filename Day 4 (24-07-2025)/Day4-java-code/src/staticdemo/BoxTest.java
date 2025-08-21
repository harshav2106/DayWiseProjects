package staticdemo;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> num = new Box<>();
        num.add(123);
        System.out.println("Integer Value: " + num.get());

        Box<String> name = new Box<>();
        name.add("Hello, World!");
        System.out.println("String Value: " + name.get());
		

	}

}
