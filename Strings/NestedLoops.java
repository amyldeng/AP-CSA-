
public class NestedLoops {
	
	public static void a() {
		for(int i = 1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void b() {
		for(int i = 1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void c() {
		for(int i = 1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void d() {
		for (int i = 1; i<=4; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void e() {
		int x = 0;
		for(int i = 4;i>=1;i--) {
			for(int j=i;j>0;j--) {
				x = i;
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public static void f() {
		for(int i = 1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void g() {
		int x = 0;
		for(int i = 1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				x = i;
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void h() {
		int x = 1;
		for(int i = 1;i<=4;i++) {
			x=1;
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
		e();
		f();
		g();
		h();
		
	}
}
