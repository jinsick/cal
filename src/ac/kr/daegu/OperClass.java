package ac.kr.daegu;

import java.util.Scanner;

public class OperClass {
Add ac;
MinorClass mc;
NumClass nc;


public OperClass(){
	System.out.println("�������α׷�");
	ac = new Add();
	mc  = new MinorClass();
	nc = new NumClass();
	
}
public void inputnumber() {
	Scanner input = new Scanner(System.in);
	System.out.println("ù��° ���� �Է�");
	nc.setNum1(input.nextInt());
	System.out.println("�ι�° ���� �Է�");
	nc.setNum2(input.nextInt());
}


public void printResult() {
	ac.clac(nc);
}
public void printResultMinor() {
	mc.clac(nc);
}

}
