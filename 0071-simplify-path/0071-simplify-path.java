class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");

        for (String directory : components) {
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } else if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(directory);
            }
        }

    

        return "/" + stack.stream().collect(Collectors.joining("/"));
    }
}