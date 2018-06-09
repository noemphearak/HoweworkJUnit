package ckcc.com.kh.answer_homework;

public class Reservation {
	private User madeBy = new User();
	
	// TODO get name user that made reservation
	public User getMadeBy() {
		return madeBy;
	}
	
	// TODO set name user who made reservation
	public void setMadeBy(User user) {
		this.madeBy = user;
	}
	
	// TODO method for get name who cancel 
	public User canBeCancelledBy(boolean user) {
		return madeBy;
	}
}
