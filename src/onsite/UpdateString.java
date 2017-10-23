package onsite;
/*
 * 给一个字符串‘abcd’，和一个[1,2,3,1]这样的list，list里的数字是指要处理几个字母。
 * 比如1就是处理‘a’，2就是处理‘ab’，都是从第一个字母开始。这里的处理是指将字母替换成它的下一个字母，比如输入‘a'，
 * 输出为’b‘， 输入’ab‘，输出‘bc’
 */
public class UpdateString {
	public String update(String s,int[] nums){
		int[] toadd=new int[s.length()];
		for(int i=0;i<nums.length;i++){
			if(nums[i]<=0||nums[i]>s.length()){
				return "";
			}
			toadd[nums[i]-1]++;
		}
		for(int i=toadd.length-2;i>=0;i--){
			toadd[i]=toadd[i]+toadd[i+1];
		}
		char[] chars=s.toCharArray();
		for(int i=0;i<chars.length;i++){
			chars[i]=(char)((chars[i]-'a'+toadd[i])%26+'a');
		}
		return String.valueOf(chars);
	}
}
