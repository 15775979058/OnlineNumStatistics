package utils;

public class OnlineCounter {
	private static long online = 0;

	public static long getOnline() {// 获取计数值
		return online;
	}

	public static void raise() {// 实现计数增1
		online++;
	}

	public static void reduce() {// 实现计数减1
		online--;
	}

}
