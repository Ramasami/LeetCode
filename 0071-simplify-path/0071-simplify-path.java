class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.push("/");
        path+="/";
        for(char c: path.toCharArray()) {
            String top = ll.peek();
            switch (c) {
                case '/': {
                    switch (top) {
                        case "/":break;
                        case ".":ll.pop(); break;
                        case "..": {
                            ll.pop();
                            if (ll.size()>2) {
                                ll.pop();
                                ll.pop(); 
                            }
                            break;
                        }
                        default:ll.push("/");
                    } 
                    break;
                } 
                case '.': {
                    switch (top) {
                        case "/": {
                            ll.push(".");
                            break;
                        }
                        default: {
                            ll.pop();
                            ll.push(top+".");
                        }
                    }
                    break;
                }
                default: {
                    switch(top) {
                        case "/": {
                            ll.push(String.valueOf(c));
                            break;
                        } 
                        default :{
                            ll.pop();
                            ll.push(top+c);
                        }
                    }
                }
            }
        }
        if (ll.size() > 1 && ll.peek().equals("/"))
            ll.pop();
        
        StringBuilder ans = new StringBuilder();
        while(!ll.isEmpty()) {
            ans.append(ll.pollLast());
        }
        return ans.toString();
    }
}