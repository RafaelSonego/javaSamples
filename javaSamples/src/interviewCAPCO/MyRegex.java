package interviewCAPCO;

import java.util.regex.Pattern;

public class MyRegex {
	private static String pattern = "([0-9]{1,3}\\.){3}[0-9]{1,3}";

	private String iP;

	public MyRegex(String iP) {
		this.iP = iP;
		System.out.println(isMatch());
	}

	public boolean isMatch() {
		Pattern myReg = Pattern.compile(pattern);
		return myReg.matcher(iP).matches();
	}
	
	/*
	 * SELECT   MIN(a.ID) a, b.ID b
FROM     VALUE_PAIRS a JOIN VALUE_PAIRS b ON b.p = a.p AND b.ID > a.ID
GROUP BY b.ID

	 * */
	
}