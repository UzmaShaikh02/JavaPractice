public class EmpWageUc4 {

	public static void main (String[] args){
		int IS_FULL_TIME = 1;
		int IS_PART_TIME =2 ;
		int EMP_RATE_PER_HOUR =20, NUM_OF_WORKING_DAYS = 2;
		int empHrs=0;
		int empWage=0, totalEmpWage=0;
		double empCheck = (int) Math.floor(Math.random()*10) % 3;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++){
			double empCheck = (int) Math.floor(Math.random()*10) % 3;			
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs=8;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
		
			empWage= empHrs *EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp wage : " +empWage);
		}
		System.out.println("Total Emp Wage : " +totalEmpWage);
	}
}
