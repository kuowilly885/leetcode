package test_crack;

class _273 {
	
    final String[] smalls ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
                      		"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
                      		"Eighteen","Nineteen"},
			 	   tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"},
			 	   ks = {"","Thousand","Million","Billion"};
	
	public String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		else if (num < 0)
			return "Negative " + numberToWords(-num);
	
		String s = "";
		int kIndex = 0;
		while (num > 0) {
			String t = lessThan1000(num % 1000);
			s = t.length() > 0 && kIndex > 0 ? (t + " " + ks[kIndex] + " " + s) : t+s;
			kIndex++;
			num/=1000;
		}
		
		return getRidOfSpaces(s);
	}
	
	public String lessThan1000(int num) {
		if (num == 0)
			return "";
		
		if (num < 20)
			return smalls[num];
		
		if (num >= 20 && num <= 99)
			return getRidOfSpaces(tens[num/10] + " " + lessThan1000(num%10));
			
		return getRidOfSpaces(lessThan1000(num/100) + " " + "Hundred" + " " + lessThan1000(num%100));
	}
	
	public String getRidOfSpaces(String s) {
		if (s.length() == 0)
			return s;
		int i = s.length()-1;
		while (i >= 0 && s.charAt(i) == ' ')
			i--;
		return s.substring(0, i+1);
	}
}
