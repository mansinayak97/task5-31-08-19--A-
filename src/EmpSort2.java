import java.util.Arrays;
import java.util.Comparator;


public class EmpSort2 {

	public static void main(String[] args) {
		Emp e1=new Emp(5001,"john",50000);
		Emp e2=new Emp(1011,"qwer",30000);
		Emp e3=new Emp(5010,"jaszd",30000);
		Emp e4=new Emp(1501,"ochn",55000);
		Emp e5=new Emp(2001,"sasdhn",40000);
		
		Emp e[]={e1,e2,e3,e4,e5};
		
		for(Emp ee:e)
		{
			System.out.println(ee);
		}
		System.out.println("sorting now");
		Arrays.sort(e,new Comparator<Emp>(){

			@Override
			public int compare(Emp e1, Emp e2) {    
				return e1.getEmpNo()-e2.getEmpNo();
			}
		});
			
		
		for(Emp ee:e)
		{
			System.out.println(ee);
		}

	}

}
