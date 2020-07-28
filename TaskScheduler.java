import java.util.Arrays;

//You are given a char freqay representing tasks CPU need to do.
//It contains capital letters A to Z where each letter represents
//a different task. Tasks could be done without the original order
//of the freqay. Each task is done in one unit of time. For each
//unit of time, the CPU could complete either one task or just be idle.
//
//However, there is a non-negative integer n that represents the 
//cooldown period between two same tasks (the same letter in the freqay),
//that is that there must be at least n units of time between any two same tasks.
//
//You need to return the least number of units of times that the CPU will take to finish all the given tasks.
public class TaskScheduler {
public static int leastInterval(char[] tasks, int n) {
        if(n==0)
        	return tasks.length;
       int freq[]=new int[26];
for(int i=0;i<tasks.length;i++) {
	char c=tasks[i];
	freq[c-'A']++;
}
Arrays.sort(freq);
//for(int i:freq) {
//	System.out.println(i);
//}
int maxfreq=freq[freq.length-1]-1;
int idletime=maxfreq*n;
System.out.println(idletime);
for(int i=freq.length-2;i>=0;i--) {
	idletime-=Math.min(freq[i], maxfreq);
//	idletime-=freq[i];
	System.out.println(idletime);
	if(idletime<=0)
		return tasks.length;
}

	return idletime+tasks.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char freq[]= {'A','A','A','B','B','B'};
System.out.println(leastInterval(freq,2));
	}

}
