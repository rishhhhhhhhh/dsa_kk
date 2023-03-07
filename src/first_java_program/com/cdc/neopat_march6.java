/*Imagine you are organizing a conference and you have a list of meeting time intervals for all the sessions you want to conduct. 
Each interval consists of a start time and an end time. You want to figure out the minimum number of conference rooms required 
to host all these meetings without any overlaps.
For instance, let's say you have three meetings with intervals [1, 3], [24], and
[5, 6]. In this case, you would need at least two conference rooms, as the first two meetings overlap in time and cannot be held in the same room.
Your task is to write a program that takes in the list of meeting time intervals
and outputs the minimum number of conference rooms required to host all
the meetings without any overlaps.

Input format
The first line contains a single integer n, the number of meetings. The following n lines each contain 
two space-separated integers starti and endi representing the start and end times of the i-th meeting.

Output format
A single integer, the minimum number of conference rooms required to accommodate all the meetings without any overlaps.

Sample testcases
Input 1
3

1 3

2 4

5 6

Output 1
The minimum number of conference rooms required is: 2 */

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;

class neopat_march6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] meetings=new int[n][2];
        for(int i=0;i<n;i++){
            meetings[i][0]=sc.nextInt();
            meetings[i][1]=sc.nextInt();
        }
        int roomsNeeded=findRoomsNeeded(meetings);
        System.out.println("The minimum number of conference rooms required is: "+ roomsNeeded);
        sc.close();
    }
    private static int findRoomsNeeded(int[][] meetings){
        Arrays.sort(meetings, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> endTimes= new PriorityQueue<>();
        endTimes.offer(meetings[0][1]);
        int roomsNeeded=1;
        for(int i=1; i<meetings.length; i++){
            if(meetings[i][0]<endTimes.peek()){
                roomsNeeded++;
            }else{
                endTimes.poll();
            }
            endTimes.offer(meetings[i][1]);
        }
        return roomsNeeded;
   }
}