package sec02.exam02_generic_type;

public class Box<T> {
  private T t;
  
  public void set(T t) {
	  this.t = t;
  }
  
  public T get() {
	  return t;
  }
}
// T자리에 다 String으로 바뀐다.(BoxExample에서 객체 생성시 <String>으로 정해줘서 T의 타입이 String으로 결정됨)