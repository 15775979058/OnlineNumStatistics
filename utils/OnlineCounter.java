package utils;

public class OnlineCounter {
	private static long online = 0;

	public static long getOnline() {// ��ȡ����ֵ
		return online;
	}

	public static void raise() {// ʵ�ּ�����1
		online++;
	}

	public static void reduce() {// ʵ�ּ�����1
		online--;
	}

}
