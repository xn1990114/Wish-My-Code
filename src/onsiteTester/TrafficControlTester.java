package onsiteTester;

import static org.junit.Assert.*;
import onsite.TrafficControl;

import org.junit.Test;

public class TrafficControlTester {

	@Test
	public void test() {
		TrafficControl tc=new TrafficControl();
		char[] a1={'R','G','R','G','G'};
		int[] e1={0,0,3};
		int[] r1=tc.reverseRange(a1);
		for(int i=0;i<3;i++){
			assertTrue(e1[i]==r1[i]);
		}
		char[] a2={'R','R','R','G','G'};
		int[] e2={0,2,5};
		int[] r2=tc.reverseRange(a2);
		for(int i=0;i<3;i++){
			assertTrue(e2[i]==r2[i]);
		}
		char[] a3={'G','G','G','G','G'};
		int[] e3={-1,-1,5};
		int[] r3=tc.reverseRange(a3);
		for(int i=0;i<3;i++){
			assertTrue(e3[i]==r3[i]);
		}
		char[] a4={'R','G','G','G','R'};
		int[] e4={0,0,3};
		int[] r4=tc.reverseRange(a4);
		for(int i=0;i<3;i++){
			assertTrue(e4[i]==r4[i]);
		}
		char[] a5={'R','G','R','G','R'};
		int[] e5={0,0,1};
		int[] r5=tc.reverseRange(a5);
		for(int i=0;i<3;i++){
			assertTrue(e5[i]==r5[i]);
		}
		char[] a6={'R','R','R','R','R'};
		int[] e6={0,4,5};
		int[] r6=tc.reverseRange(a6);
		for(int i=0;i<3;i++){
			assertTrue(e6[i]==r6[i]);
		}
	}

}
