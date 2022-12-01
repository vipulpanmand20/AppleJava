
public class CharacterCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';// A=65,B=66.. a=97,b=98...97-65=32
		ch=(char)(ch+32);
		System.out.println(ch);
		/*int i = ch;// 65
		i = i + 32;// 65+32=97
		System.out.println("Uppercase to lowercase:\n"+(char)i);// type casting */
char c='a';
		int j=c;
		j=j-32;
		System.out.println("Lowercase to Uppercase:\n"+(char)j);// type casting);
	}

}
