//2020-12-14 �̰��� �ڹٴ� p37
package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		int var1;

		if(true) {
			int var2;

			var1 = 10;
			var2 = 20;
		}

		var1 = 10;
		//var2 = 20;	//������ ����(��� �ٱ� var2 cannot be resolved to a variable)

		for(int i=0; i<1; i++) {
			int var3;

			var1 = 10;
			var3 = 30;
		}
		
		var1 = 10;
//		var3 = 30;	//������ ���� (var3 cannot be resolved to a variable)
	}
}


