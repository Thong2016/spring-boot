package vip.tanghong.springboot.domain;

public class Demo3_Test_Extends {

	public static void main(String[] args) {
		Zis z = new Zis();
		z.show();		
	}

}


class Fus{
	public int num = 10;
	
	public Fus(){
		System.out.println("fu");
	}
}
class Zis extends Fus{
	public int num = 20;
	
	public Zis(){
		System.out.println("zi");
	}
	
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}