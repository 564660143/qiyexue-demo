package lambda;
interface IMessage{
	void print(String s);
}

interface IMessage1{
	void print();
}

interface IMessage2{
	String toupper(String s);
}

public class LambdaTest {
	
	public static void sayHello(String s){
		System.out.println("Hello World") ;
	}
	
	public static void sayHello(IMessage1 iMessage){
		System.out.println("Hello World") ;
	}
	
	public static void print(IMessage iMessage, String s){
		iMessage.print(s);
	}
	
	public static String toUpper(IMessage2 iMessage, String s){
		return iMessage.toupper(s);
	}
	
	
	public static void main(String [] args) {
		sayHello(() ->System.out.println());
		print((String s) ->System.out.println(s) , "hello 七夜雪");
		
		toUpper((String s) ->{
			System.out.println(s.toUpperCase()) ;
			return s.toUpperCase();
		}, "hello 七夜雪");
		/**
		 * 使用lambda式实现函数式接口时,只能转换成对应的接口对象, 转换成object对象都是错误的
		 * 如下面这条语句编译会报错 : Object obj = () -> System.out.println("使用lambda表达式来实现Runnable接口") ; 
		 */
		Runnable r1 = () -> System.out.println("使用lambda表达式来实现Runnable接口") ;
		new Thread(r1).start();
		
	}
	
}
