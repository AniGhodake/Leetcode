class Solution {
    public int countDays(int days, int[][] meetings) {
          // Sort meetings by their start time
        Arrays.sort(meetings, (meeting1, meeting2) -> Integer.compare(meeting1[0], meeting2[0]));

        int freeDays = 0;
        int lastOccupiedDay = 0;

        for (int[] meeting : meetings) {
            int meetingStart = meeting[0];
            int meetingEnd = meeting[1];

            // Count free days before the next meeting starts
            if (meetingStart > lastOccupiedDay) {
                freeDays += (meetingStart - lastOccupiedDay - 1);
            }

            // Update the last occupied day to the latest meeting end
            lastOccupiedDay = Math.max(lastOccupiedDay, meetingEnd);
        }

        // Count remaining free days after the last meeting
        freeDays += Math.max(0, days - lastOccupiedDay);

        return freeDays;
    }
}