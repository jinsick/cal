package ac.kr.daegu;

public class Add implements Hab {
 public void clac(NumClass nc) {
	 System.out.println("���ϱ� ����");
	System.out.println(nc.getNum1()+"+"+nc.getNum2()+"="+(nc.getNum1()+nc.getNum2()));
 }
}
