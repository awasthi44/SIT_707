package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    
    // Test to ensure Student ID is provided
    @Test
    public void testStudentIdentity() {
        String studentId = " 224887189";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    // Test to ensure Student Name is provided
    @Test
    public void testStudentName() {
        String studentName = "Shova Awasthi";
        Assert.assertNotNull("Student name is null", studentName);
    }
    
    // Test case to check if an odd number is correctly identified as not even
    @Test
    public void testFalseNumberIsEven() {
        int number = 3;
        Assert.assertFalse("Number should not be even", WeatherAndMathUtils.isEven(number));
    }
    
    // Test case to check if the weather advice returns "CANCEL" for dangerous conditions
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0)); // Wind speed > 70 mph
    }
    
    // Test case to check if the weather advice returns "WARN" for concerning conditions
    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 4.5)); // Wind speed > 45 mph and precipitation > 4 inches
    }

    // Test case to check if the weather advice returns "ALL CLEAR" for normal conditions
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0)); // Wind speed < 45 mph and precipitation < 4 inches
    }

    // Test case to check if the weather advice throws an IllegalArgumentException for negative inputs
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentWeatherAdvice() {
        WeatherAndMathUtils.weatherAdvice(1.0, 5.0); // Invalid negative wind speed
    }
    
    // Test case to check if a prime number is correctly identified as prime
    @Test
    public void testPrimeNumber() {
        Assert.assertTrue("Number should be prime", WeatherAndMathUtils.isPrime(5)); // Prime number
    }

    // Test case to check if a non-prime number is correctly identified as not prime
    @Test
    public void testNonPrimeNumber() {
        Assert.assertFalse("Number should not be prime", WeatherAndMathUtils.isPrime(6)); // Non-prime number
    }

    // Test case to check if a negative number is correctly identified as not prime
    @Test
    public void testNegativeNumberIsNotPrime() {
        Assert.assertFalse("Negative number should not be prime", WeatherAndMathUtils.isPrime(-5)); // Negative number
    }

    // Test case for a number less than 2, which should not be prime
    @Test
    public void testNumberLessThanTwo() {
        Assert.assertFalse("Number should not be prime", WeatherAndMathUtils.isPrime(1)); // 1 is not prime
    }

    // Test case to check if an even number is correctly identified as even
    @Test
    public void testTrueNumberIsEven() {
        int number = 4;
        Assert.assertTrue("Number should be even", WeatherAndMathUtils.isEven(number));
    }
}
