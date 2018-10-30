package lambda;

class Person{
	private String name;
	private int  age;
	
	public Person(String name, int age) {
		this.name = name ;
		this.age = age ;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]" ;
	}
}

@FunctionalInterface
interface IMethodRef<T>{
	T create(String name, int age);
}

public class MethodRefTest2 {
	
	public static void main(String [] args) {
		// 表示IMethodRef的create引用Person的构造方法来实现
		IMethodRef<Person> ref = Person :: new;
		Person p = ref.create("七夜雪", 18);
		// 输出结果, Person [name=七夜雪, age=18]
		System.out.println(p) ;
	}
	
}
