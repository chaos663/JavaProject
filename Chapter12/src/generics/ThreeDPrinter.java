package generics;

public class ThreeDPrinter<T extends Material> {
	//<T> 붙이면 generic class가 된다. T는 타입이라고 보면된다. 아무 타입이나 와도됨!
	//위 코드는 상속받은 클래스의 타입만 사용 가능 
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
		
		
	}
	
	@Override
	public String toString() {
		return material.toString();
	};
	
	

}
