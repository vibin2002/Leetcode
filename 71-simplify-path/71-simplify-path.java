class Solution {
    public String simplifyPath(String path) {
        List<String> stack = new ArrayList<>();
        String arr[] = path.split("/");
        for(String s:arr){
            if(s.length() == 0 || s.equals("."))
                continue;
            if(s.equals("..")){
                if(stack.size()!=0)
                    stack.remove(stack.size()-1);
            } else if(!s.equals("." )){
                stack.add(s);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(String str:stack){
            sb.append("/");
            sb.append(str);
        }
        String res = sb.toString();
        return res.length() == 0 ? "/" : res;
    }
}