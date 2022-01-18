package com.moodanalyzer;

public class MoodAnalyzer{
    public static String analyzeMood(String mood)
    {
        try {
              if (mood.contains("Sad"))
                return "SAD";
            }
        catch (Exception e)
        {
            return "Happy";
        }
    return "Happy";
    }
}
