package array;

import java.util.Arrays;
import java.util.Scanner;


public class ManipulateScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); // 점수 저장할 과목 수 
		double[] arr = new double[C]; // 과목의 점수
		double scores = 0.0; // 변환된 총점 변수 선언
		
		for(int i=0; i<C; i++) { // 점수 입력
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) { // 점수 변환 
			arr[i] = arr[i] / arr[arr.length-1] * 100;
			scores += arr[i]; // 총점수 구하기 
		}
		
		
		
		
		System.out.println(scores / arr.length);
	}
//	public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        
//        int n = in.nextInt(); // 점수를 저장할 과목 수       
//        double arr[] = new double[n]; // 과목 수 크기로 배열 생성, 소수점 표현을 위해 double 형    
//        double sum=0;
//        
//        for(int i=0;i<arr.length;i++){
//            arr[i] = in.nextDouble();
//        }
//        
//        Arrays.sort(arr); // 배열을 정렬해 최댓값을 찾는다.
//        
//        for(int i=0;i<arr.length;i++){
//        	arr[i] = arr[i]/arr[arr.length-1] * 100; // 점수 재정의
//        	sum+=arr[i];
//        }
//        
//        System.out.println(sum/arr.length); // 평균 출력
//    }
}
