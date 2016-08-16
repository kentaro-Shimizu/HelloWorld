class TestOperator {
	public static void main(String[] args) {
		int x = 10, y = 3, z = 0;
		System.out.println("インクリメント／デクリメント演算子");
		// 後置インクリメント演算子
		x = 10;
		y = 3;
		System.out.println("x=" + x + " y=" + y);
		z = y++ * x;
		System.out.print("1. z=y++*x: ");
		System.out.println("z=" + z + " y=" + y);
		// 前置インクリメント演算子
		x = 10;
		y = 3;
		System.out.println("x=" + x + " y=" + y);
		z = ++y * x;
		System.out.print("2. z=++y*x: ");
		System.out.println("z=" + z + " y=" + y);
	}
}
