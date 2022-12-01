package inheritance;

public class AddressMaincon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1=new Person();
		AddressCon a1=new AddressCon(410504,"Junnar","Pune","Maharastra");
		PersonCon p1=new PersonCon(101,123456745,"Vishal","Ale", "zxcvbnm@",a1);
		PersonCon p2=new PersonCon(102,12345678,"Vipul","Khodad", "zxcvbnm@",a1);
        PersonCon p3=new PersonCon(103,198765465,"Suyog","Narayangoan", "qwertyui@",a1);
       // System.out.println(a1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
	}

}
