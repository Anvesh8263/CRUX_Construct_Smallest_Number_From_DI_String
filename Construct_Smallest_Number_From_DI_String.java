class Solution {
    public String smallestNumber(String pattern) {
        return Smallest_Number(pattern);
        
    }
    public static String Smallest_Number(String pattern){
        int [] ans = new int[pattern.length()+1];
        Stack<Integer> st = new Stack<>();
        int c = 1;
        for(int i =0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }

            }else{
                st.push(i);
            }
        }
        String s ="";
        for(int i =0;i<ans.length;i++){
            s+=ans[i];
        }
        return s;
    }
}
