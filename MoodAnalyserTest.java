package com.BridgeLabz_Day21Assignment;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void sadTest() {
		try {
			MoodAnalysis moodanalysis = new MoodAnalysis();
			String sadmsg = moodanalysis.analysemood();
			Assert.assertEquals("SAD", sadmsg);
		}catch(Exception e){
			//System.out.println("Exception Handled");
		}
	}

	@Test
	public void happyTest() {
		try {
			MoodAnalysis moodanalysis = new MoodAnalysis("This is a Happy message");
			String happymsg = moodanalysis.analysemood();
			Assert.assertEquals("HAPPY", happymsg);
		}catch(Exception e){
			//System.out.println("Exception Handled");
		}
	}

	@Test
	public void Analysemoodexception() {
		try {
			MoodAnalysis moodanalysis = new MoodAnalysis();
			String happymsg = moodanalysis.analysemoodexception();
			Assert.assertEquals("Sad", happymsg);
		}catch(MoodAnalysisException e){
			//System.out.println("Exception Handled");
		}
	}
}
