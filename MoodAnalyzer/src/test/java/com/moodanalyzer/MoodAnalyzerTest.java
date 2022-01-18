package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer m = new MoodAnalyzer();
    @Test
    public void givenMsg_WhenProper_ShouldRetrunSad(){
        String result=m.analyzeMood("User is Sad");
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void givenMsg_WhenProper_ShouldRetrunHappy(){
        String hpyResult=m.analyzeMood("give any input");
        Assertions.assertEquals("Happy",hpyResult);
    }
    @Test
    public void givenMsg_WhenProper_ShouldRetrun(){
        String hpyResult=m.analyzeMood(null);
        Assertions.assertEquals("Happy",hpyResult);
    }
}
