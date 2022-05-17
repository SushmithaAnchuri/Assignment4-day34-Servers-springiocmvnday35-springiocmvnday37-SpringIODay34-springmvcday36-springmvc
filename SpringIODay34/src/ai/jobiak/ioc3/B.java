package ai.jobiak.ioc3;

public class B {

	public void printingDesign() {
		A a=new A();//dependency
					//1.they cause maintenance nightmare's
					//2.Testing
					//3.Decouples the dependency through interfaces,there by the 
		a.print();	//(against agile methodology)
	}
}
