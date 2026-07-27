class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder res=new StringBuilder();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='('){
                count++;
            
                if(count>1){
                    res.append(ch);

                }
            }
            
            else{
                count--;
                if(count>0){
                    res.append(ch);

                }
            }
        }
        return res.toString();
        
    }
}
