package com.BridgeLabz_Day21Assignment;

public class MoodAnalysis {
	String message;

	public MoodAnalysis() {
		super();
	}

	public MoodAnalysis(String message) {
		super();
		this.message = message;
	}

	public String analysemood() {
		if (message.contains("uff"))
			return "SAD";
		else
			return "HAPPY";
	}

	public String analysemoodexception() throws MoodAnalysisException {
		if(message != null)
			if (message.contains("Sad")) {
				System.out.println("Valid");
				return "Sad";
			}
		throw new MoodAnalysisException("NullPointerException occured");
	}
	
	public static void main(String[] args) {
		MoodAnalysis moodanalysis = new MoodAnalysis("uf");
		String string=moodanalysis.analysemood();
		System.out.println(string);
	}
}
