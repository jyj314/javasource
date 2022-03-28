package api;

import static java.lang.Math.*;

public class MathEx2 {

	public static void main(String[] args) {
		double val = 90.7552;
		
		System.out.println("반올림 "+round(val)); // Math.round = import stataic Math 를 하면  Math.을 뗴어내도됨
		System.out.println("올림 "+ceil(val)); // Math.ceil = import stataic Math 를 하면  Math.을 뗴어내도됨
		System.out.println("내림 "+floor(val)); // Math.floor = import stataic Math 를 하면  Math.을 뗴어내도됨
		
		System.out.println(PI);

	}

}
