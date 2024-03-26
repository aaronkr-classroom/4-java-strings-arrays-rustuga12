
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myGrades = new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0
		};
		double sum = 0.0;
		double avg = 0.0;
		
		//2차원 배열
		double[][] myClassGrades = new double[][] {
				{89.1, 88.2, 83.2, 85.5, 75.2}, 
				{95.0, 93.2, 91.3, 85.2, 67.2}, 
				{87.7, 91.3, 27.6, 96.1, 100 },
				{88.3, 95.2, 17.2, 79.1, 26.1}, 
				{100.0, 23.6, 16.7, 19.1, 28.1}
		};
		String[] myClasses = new String[] {
				"국어", "수학", "공학", "사회", "PE"
		};
		
		for (int i=0; i<myClasses.length; i++) {
			System.out.print(myClasses[i] + ": ");
			for (int j =0; j < 5; j++) {
				System.out.print(myClassGrades[i][j] + ", ");
			}
			System.out.println();
		}
		
		/*
		
		for (double g : myGrades) {
			sum += g;
		}
		
		avg = sum / myGrades.length;
		System.out.println("합계: " + sum);
		System.out.format("평균: %.2f", + avg);*/
	}

}
