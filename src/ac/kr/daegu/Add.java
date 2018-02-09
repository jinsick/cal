package ac.kr.daegu;

public class Add implements Hab {
 public void clac(NumClass nc) {
	 System.out.println("더하기 연산");
	System.out.println(nc.getNum1()+"+"+nc.getNum2()+"="+(nc.getNum1()+nc.getNum2()));
 }
}
