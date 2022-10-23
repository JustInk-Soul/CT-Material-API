package crafttech.api.common;

public class RegistryUtilities {
	public static String getRegistryName(String str) {
		var tmp = str.toLowerCase();
		var tmp_2 = "";

		// TODO 用正则表达式替换此处的实现
		for (var i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) != ' ') {
				tmp_2 += tmp.charAt(i);
			} else {
				tmp_2 += "_";
			}
		}
		return tmp_2;
	}
}
