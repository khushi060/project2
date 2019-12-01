package khushi;

public class EncapsulationEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		Emp e2=new Emp();
		//e1.EmpId=5;
		
		e1.setEmpId(4);
		e2.setEmpId(5);
		e1.setEmpName("khushi");
		e2.setEmpName("shivani");
		
		System.out.println(e1.getEmpId());
		System.out.println(e2.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e2.getEmpName());
	}

}

