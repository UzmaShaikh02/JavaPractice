public class EmpWageUc4 {

	public static void main (String[] args){
		int IS_FULL_TIME = 1;
		int IS_PART_TIME =2 ;
		int EMP_RATE_PER_HOUR =20;
		int empHrs=0;
		int empWage=0;
		double empCheck = (int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
			case IS_PART_TIME:
				empHrs=4;
			default:
				empHrs=0;
		}

		empWage= empHrs *EMP_RATE_PER_HOUR;
		System.out.println("Emp wage : " +empWage);

	}
}
