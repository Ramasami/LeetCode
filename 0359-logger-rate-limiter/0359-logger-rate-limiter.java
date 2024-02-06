class Logger {
    
    Map<String, Integer> m;

    public Logger() {
        m = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!m.containsKey(message) || timestamp - m.get(message) >= 10) {
            m.put(message, timestamp);
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */