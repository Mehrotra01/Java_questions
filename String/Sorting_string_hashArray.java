class Solution{
  static final int MAX_CHAR = 26;
	public static void main (String[] args) {
    sortString("harshmehrotra");// only for small letters not for capital letters
	}
	static void sortString(String str){
    int letters[] = new int[MAX_CHAR]; //Hash array to keep count   
	for (char x : str.toCharArray()) {
 
            // 'a'-'a' will be 0, 'b'-'a' will be 1,
            // so for location of character in count
            // array we will do str[i]-'a'.
            letters[x - 'a']++;
}
	for (int i = 0; i < MAX_CHAR; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }    
	}
}
