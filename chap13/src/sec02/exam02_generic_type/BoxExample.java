package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
	  Box<String> box = new Box<String>();
	  
	  box.set("홍길동");
	  
	  String t = box.get();
	  
	  Box<Integer> box2 = new Box<Integer>();
	  
	  box2.set(3);
	  
	  int c = box2.get();
	  
	}

}
