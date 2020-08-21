package 内部类;

class padre{
	void metodopadre() {
		System.out.println("soy padre");
	}
}
class madre{
	void metodomadre() {
		System.out.println("soy madre");
	}
}

class padre2{
	void metodopadre2() {
		System.out.println("soy padre222");
	}
}
public class fuera {
	hijomama mama1=null;
	static int fuera=55;
	
	private dentro getiniciar() {
		
		return new dentro();
	}
	
	
	public hijomama inicar() {
		if(mama1==null) 
			mama1= new hijomama();
		return mama1;
		
	}
	
	 class dentro{
		void metododentro() {
			System.out.println("soy metododentro");
		}
		void metododento2() {
			System.out.println("soy metododnetro2");
		}
	}
	 
	 class hijomama extends madre{
		
	 }
	 class hijopapa extends padre{
		 
	 }
	 static class hijopapa2 extends padre2{
		 
	 }
	 
 public static void main(String[] args) {
	// TODO Auto-generated method stub

	fuera a=new fuera();
	dentro dentros=a.getiniciar();//必须在fucera用个方法来iniciar它  //现在我们可以用dentros 的对象了
	 dentros.metododentro();//用dentro里面的metodo
	 
	 
	 // hijomama 为内部类继承了 clase mama
		fuera.hijomama mama=	 a.new hijomama();						
		mama.metodomadre();								// * 内部类对象的一般形式为： 外部类类名.内部类类名 xxx =对象. new 外部类类名.内部类类名()							
		fuera.hijopapa papa=	 a.new hijopapa();						
		papa.metodopadre();							//因为clase hijopapa和hijomama不是static那么就需要依赖外部类，
												//就像main没static一样，要先创造objeto来叫这个类
			
		
		
		fuera.hijopapa2 papa2=new fuera.hijopapa2();		//静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，
														//并且它不能使用外部类的非static成员变量或者方法，这点很好理解，
														//因为在没有外部类的对象的情况下，可以创建静态内部类的对象					
	papa2.metodopadre2();
	
	
	
	fuera prueba=new fuera();
	prueba.inicar();
	prueba.mama1.metodomadre();
	//https://www.runoob.com/w3cnote/java-inner-class-intro.html
	//https://blog.csdn.net/zhao_miao/article/details/83245816
	//https://www.cnblogs.com/yangming1996/p/8869081.html
}
}
