package ac.kr.daegu;

public class MinorClass implements Hab{

	public void clac(NumClass nc) {
		System.out.println(nc.getNum1()+"-"+nc.getNum2()+"="+(nc.getNum1()-nc.getNum2()));
	}
	
}
