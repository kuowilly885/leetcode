package test_crack;

class _392 {
    public boolean isSubsequence(String s, String t) {
        int tSize = t.length();
        int sSize = s.length();
        
        if (sSize == 0)
            return true;
        
        int k = 0;

        boolean[] check = new boolean[sSize];
        for (int i = 0 ; i < tSize ; i++) {
            
            if (!check[0]) {
                if (t.charAt(i) == s.charAt(0)) {
                    check[0] = true;
                    k++;
                }
                continue;
            }

            for (int j = k ; j < sSize; j++) {

                if (!check[j] && check[j - 1]) {
                    if (t.charAt(i) == s.charAt(j))
                    {
                        check[j] = true;
                        k++;
                        break;
                    }
                }
            }
            
            if (check[sSize - 1])
                return true;
        }
        return false;
    }
}
