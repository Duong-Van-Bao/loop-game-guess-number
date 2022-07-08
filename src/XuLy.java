import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		guessNumber(scan);
	}
	
	public static void guessNumber(Scanner scan) {
		int soBiMat =(int) (Math.random() * 99 + 1);
		int nhap;
		do {
			System.out.println("Vui lòng nhập vào một số từ 1 - 99");
			nhap =Integer.parseInt(scan.nextLine());
			if(nhap < soBiMat) {
				System.out.println("Vui lòng nhập vào số lớn hơn");
			} else if(nhap > soBiMat){
				System.out.println("Vui lòng nhập vào số bé hơn");
			}
		} while(soBiMat != nhap);
		System.out.println("Chúc mừng chiến thắng");
	}

}
