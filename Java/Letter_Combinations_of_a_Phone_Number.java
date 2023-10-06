class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l=new  ArrayList<String>();
        if(digits.length()==0)
        return l;
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         
        check(0,arr,digits,"",l);
        return l;
    }
    public static void check( int in,String []arr,String digits,String a,List<String> l)
    {
        if(digits.length()==in)
        {
            l.add(a);
            return;
        }
        int j=digits.charAt(in)-'0';
        for(int i=0;i<arr[j].length();i++)
        {check(in+1,arr,digits,a+arr[j].charAt(i),l);

        }
    }
}
