package com.example.ATM;

import com.example.ATM.service.atmState.Atm;
import com.example.ATM.models.Card;
import com.example.ATM.models.User;
import com.example.ATM.models.UserBankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmApplication.class, args);
		AtmApplication atmApplication = new AtmApplication();

	}
	public void initialize() {
		Atm atm = Atm.getInstance();
		atm.setBalance(10000, 8,10,5);

		User user = createUser();
		UserBankAccount userBankAccount = createBankAccount(765828, "Ruchita", 20000);
		Card card = createCard(568299763, 765, "Ruchita", userBankAccount);
		user.setCard(card);
		user.setUserBankAccount(userBankAccount);


	}
	public User createUser() {
		User user = new User();
		return user;
	}
	public Card createCard(int cardNumber, int cvv, String cardHolderName, UserBankAccount userBankAccount) {
		Card card = new Card();
		card.setCardNumber(cardNumber);
		card.setCardHolderName(cardHolderName);
		card.setCvv(cvv);
		card.setUserBankAccount(userBankAccount);
		return card;
	}
	public UserBankAccount createBankAccount(int accountNumber, String accountHolderName, double balance) {
		UserBankAccount userBankAccount = new UserBankAccount();
		userBankAccount.setAccountNumber(accountNumber);
		userBankAccount.setAccountHolderName(accountHolderName);
		userBankAccount.setAccountBalance(balance);
		return userBankAccount;
	}


}
