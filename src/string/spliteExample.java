package string;

public class spliteExample {

	public static void main(String[] args) {
		String str = "vik(ash";
		String[] str2 = str.split("\\(");
		String[] cp = str.split("\\(|\\)");
		System.out.println(cp);

	}

}
