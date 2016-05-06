package xyz.flym.carlis.web.action.consts;

/**
 * 
 * @author Administrator
 *
 */
public enum Comment {
	BAD(0), GOOD(1), NORMAL(2);

	private int value;

	private Comment(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

	public static Comment valueOf(int value) {
		switch (value) {
		case 0:
			return BAD;
		case 1:
			return GOOD;
		case 2:
			return NORMAL;
		default:
			return NORMAL;
		}
	}

	public static void main(String[] args) {
		System.out.println(Comment.GOOD.value()); // 1
		System.out.println(Comment.BAD.value()); // 2
		System.out.println(Comment.valueOf(1)); // FruitEnum.APPLE
		System.out.println(Comment.valueOf(2)); // FruitEnum.ORANGE
	}

}
