package onsite;
import java.util.*;
/*
 * 交通控制。给出一个Char Array, 里面只有 R, G. 现在要选择一个范围，
 * 使得 R 变成G，G变成R，并使得G的个数－ R的个数最大。输出这个范围并且输出最大结果.
 */
public class TrafficControl {
	public int[] reverseRange(char[] traffic){
		int[] right=new int[traffic.length];
		int last=0;
		for(int i=traffic.length-1;i>=0;i--){
			right[i]=last;
			last=last+(traffic[i]=='R'?-1:1);
		}
		int[] result={-1,-1,last};
		int netGCount=0;
		// index0 is char index, index1 is netGCount
		TreeSet<int[]> ts=new TreeSet<int[]>(new Comparator<int[]>(){
			public int compare(int[] i1,int[] i2){
				return i2[1]-i1[1];
			}
		});
		int[] ori={-1,0};
		ts.add(ori);
		for(int i=0;i<traffic.length;i++){
			if(traffic[i]=='R'){
				netGCount--;
			}
			else{
				netGCount++;
			}
			int[] max=ts.first();
			int curr=max[1]-(netGCount-max[1]);
			if(curr+right[i]>result[2]){
				result[0]=max[0]+1;
				result[1]=i;
				result[2]=curr+right[i];
			}
			int[] toadd={i,netGCount};
			ts.add(toadd);
		}
		return result;
	}
}
