
public class computer {

	int sum(int...values) {
		int sum = 0;
		
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
		
	}
	
	double [] num(int...values) {
		int sum = 0;
		
		for(int i = 0; i<values.length; i++) {
			sum +=values[i];
		}
		
		double avg [] = {
				(double)sum/(double)values.length, (double)sum
		};
		
		return avg;
	}
	//------------------------------안보고 한번 더 한거임
	
	
	double[] N1 (int...values) {
		int sum =0;
		double avg =0;
		
		
		for(int i = 0; i<values.length; i ++) {
			sum +=values[i]; //총합
		}
		avg = (double)sum/(double)values.length;//평균
		double[] re= {sum,avg};
		return re;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
