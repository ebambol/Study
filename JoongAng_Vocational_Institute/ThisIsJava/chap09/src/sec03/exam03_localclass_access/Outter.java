package sec03.exam03_localclass_access;

public class Outter {
	//�ڹ�8 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				/*
				 * final�� ������
				 * int arg = 10;
				 * int localVariable = 1;
				 */
				int result = arg + localVariable;
			}
		}
	}
	//�ڹ�8 ����
	public void method2(int arg) {
		int localVariable = 1;
		class Inner {
			/*
			 * fianl�� ������
			 * int arg = 10;
			 * int localVariable = 1;
			 */
			void method() {
				/*
				 * final�� ������
				 * int arg = 10;
				 * int localVariable = 1;
				 */
				int result = arg + localVariable;
			}
		}
	}
}
