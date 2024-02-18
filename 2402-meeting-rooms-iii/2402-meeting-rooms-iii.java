class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] meetingCount = new int[n];
        Queue<Integer> unusedRoom = new PriorityQueue<>();
        Queue<long[]> usedRoom = new PriorityQueue<>(
            (a,b) -> 
            a[0]!=b[0] ? 
            Long.compare(a[0],b[0])
            :Long.compare(a[1],b[1])
        );
        
        for(int i=0;i<n;i++)
            unusedRoom.add(i);
        
        Arrays.sort(meetings, (a,b)->a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        
        for(int[] meeting:meetings) {
            int start = meeting[0];
            int end = meeting[1];
            while(!usedRoom.isEmpty() && usedRoom.peek()[0] <= start) {
                int room = (int) usedRoom.poll()[1];
                unusedRoom.add(room);
            }
            
            if(!unusedRoom.isEmpty()) {
                int room = unusedRoom.poll();
                usedRoom.add(new long[]{end, room});
                meetingCount[room]++;
            } else {
                long roomAvailabilityTime = usedRoom.peek()[0];
                int room = (int) usedRoom.poll()[1];
                usedRoom.add(new long[]{roomAvailabilityTime + end - start, room});
                meetingCount[room]++;
            }
        }
        
        int maxMeetingCount = 0, maxMeetingCountRoom = 0;
        for (int i = 0; i < n; i++) {
            if (meetingCount[i] > maxMeetingCount) {
                maxMeetingCount = meetingCount[i];
                maxMeetingCountRoom = i;
            }
        }

        return maxMeetingCountRoom;
    }
}