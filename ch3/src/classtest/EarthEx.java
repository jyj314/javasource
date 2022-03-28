package classtest;

// java.util 패키지명

import java.util.Scanner;

public class EarthEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름 "+Earth.EARTH_RADIUS+" km^2");
		System.out.println("지구의 표면전 "+Earth.EARTH_SURFACE_AREA+" km^2");
		
		
		sc.close();

	}

}
