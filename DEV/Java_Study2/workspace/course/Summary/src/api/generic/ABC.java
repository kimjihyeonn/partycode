package api.generic;

public class ABC<T> {
	//T는 아직 미정입니다. Type으로 사용이 가능합니다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
