package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.UpdateString;

public class UpdateStringTester {

	@Test
	public void test() {
		UpdateString tester=new UpdateString();
		int[] nums1={1,2,3,1};
		assertTrue(tester.update("abcd", nums1).equals("eddd"));
		int[] nums2={26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		assertTrue(tester.update("abcdefghijklmnopqrstuvwxyz", nums2).equals("aaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}

}
