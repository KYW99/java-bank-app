package bank.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bank2 {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();	
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("--------------계좌생성--------------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: " );
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = new Account(ano, owner, balance);
		accounts.add(account);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	private static void accountList() {
		System.out.println("--------------계좌목록--------------");
        System.out.println(accounts);
	}
	
}