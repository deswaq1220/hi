
public class koreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		korean k1 = new korean("123456-1234567","박박디라라");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 필드에는 경우에는 값을 바꿀수 없다. 
//		k1.nation = "미국" ;
//		k1.ssn = "456789-451215";
		
		//인스턴스 멤버의 값은 변경 가능
		k1.name ="감자범벅";
		System.out.println(k1.name);
	

	}

}
