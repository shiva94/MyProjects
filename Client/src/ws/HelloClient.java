package ws;

public class HelloClient {

	public static void main(String[] args) {
		HelloWorldImplService service= new HelloWorldImplService();
		HelloWorld world= service.getHelloWorldImplPort();
		System.out.println(world.sayHello("asdf"));
		System.out.println(world.add(2,3));

	}

}
