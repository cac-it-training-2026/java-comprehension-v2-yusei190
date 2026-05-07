package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader reader = new ConsoleReader();

		Member miura = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member sato = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(miura);
		members.add(sato);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		int inputId = 0;
		String newPassword = "";

		try {
			System.out.println("===パスワードを変更します===");
			System.out.print("input target id>>");
			inputId = reader.inputNumber();

			System.out.print("input new password>>");
			newPassword = reader.inputString();

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, inputId, newPassword);

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
