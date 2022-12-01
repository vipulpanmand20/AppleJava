package polymorphism;

public class BigKidMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Kid k=new Kid();
     k.readBook();
     BigKid bg=new BigKid();
     bg.readBook();
     bg.readBook("tom and jerry cartoon", 2  );
	}

}
