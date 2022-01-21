package sec02.exam02_generic_type;

public class BoxExample2 {

	public static void main(String[] args) {
		Box2<String> b = new Box2<String>();
		
		b.set("홍길동");
		
		String name = b.get();

	}

}
// 제네릭 타입으로 <String>을 지정해줌으로써 객체에서 값을 받아올때 따로 형변환 할 필요성이 없어졌다.