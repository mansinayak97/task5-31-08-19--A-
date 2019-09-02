import java.util.HashMap;


public class Coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Emp,Project> map= new HashMap();
		
		Emp e1=new Emp(111,"AAA",10000);
		Emp e2=new Emp(111,"AAA",10000);
		Emp e3=new Emp(113,"CCC",30000);
		Emp e4=new Emp(114,"DDD",25000);
		Emp e5=new Emp(115,"EEE",30000);
		
		Project p1=new Project(1001,"qwer","asdf","zxc");
		Project p2=new Project(1002,"poi","lkjh","mnb");
		Project p3=new Project(1003,"vbc","ghfj","rtyu");
		Project p4=new Project(1004,"zxmn","alkj","qpo");
		Project p5=new Project(1005,"zdti","mjyt","rfb");
		
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		map.put(e4, p4);
		map.put(e5, p5);
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(map);
	}

}
