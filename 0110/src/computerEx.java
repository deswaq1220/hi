
public class computerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		computer mycom = new computer();
		
		int result1 = mycom.sum(1,2,3);
		
		System.out.println("result1:" + result1);
		
		int result2 = mycom.sum(1,2,3,4,5);
		System.out.println("result2:" + result2);
		
		int[] values = {1,2,3,4,5};
		int result3 = mycom.sum(values);
		System.out.println("result3:" + result3);
		
		int result4 = mycom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4:" + result4);
		
		
		// 가변길이 매개변수를 이용하여 입력된 매개변수의 총합과 평균을 구하는 프로그램 작성
		
		
		
		int result5 = mycom.sum(new int[] {1,2,3,45,6});
		System.out.println(result5);
		
		double [] result6 = mycom.num(25,89,78,54);
		System.out.println("평균"+result6[0]);
		System.out.println("총합"+result6[1]);
	
		//-------------------안보고 한번 더 한거임
		double [] result7 = mycom.N1(83,93,53,43,23,13);
		
		System.out.println("총합" + result7[0]);
		System.out.println("퍙균" + result7[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
