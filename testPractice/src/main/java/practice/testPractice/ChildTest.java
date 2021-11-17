package practice.testPractice;

public class ChildTest extends Test implements Roles {

	public ChildTest() {
		System.out.println(" default----");
	}

	Test cp = new Test();

	public void cct() {

		String returnResult = m2();
		if (returnResult.equalsIgnoreCase("Yes")) {
			int j = 0;
			for (j = 0; j < 4; j++) {
				System.out.println("  for :  " + j);
			}
			int i = 0;
			while (i < 4) {
				System.out.println("  while :  " + i);
				i = i + 1;
			}

		}

	}

	public static String m2() {
		String firstName = "David";
		String lastName = "Attenb";
		String result = firstName + lastName;
		System.out.println(" i am static from ChildTest calass");
		return "Yes";
	}

	@Override
	public void role1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void usernewRole() {
		// TODO Auto-generated method stub

	}
}
