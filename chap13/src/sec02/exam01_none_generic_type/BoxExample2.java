package sec02.exam01_none_generic_type;

public class BoxExample2 {

	public static void main(String[] args) {
		
		Box2 box = new Box2();
		
		box.set("홍길동");
		
		String name= (String) box.get();
		
	}

	
}
