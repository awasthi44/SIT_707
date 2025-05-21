package sit707_week5;

import org.junit.*;

public class WeatherControllerTest {

	private WeatherController wController;
	private int nHours;

	@Before
	public void setUp() {
		// Arrange (shared)
		wController = WeatherController.getInstance();
		nHours = wController.getTotalHours();
	}

	@After
	public void tearDown() {
		// Clean up
		wController.close();
	}

	@Test
	public void testStudentIdentity() {
		String studentId = "224887189";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shova Awasthi";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testTemperatureMin() {
		System.out.println("+++ testTemperatureMin +++");

		// Act
		double minTemperature = 1000;
		for (int i = 0; i < nHours; i++) {
			double temperatureVal = wController.getTemperatureForHour(i + 1);
			if (minTemperature > temperatureVal) {
				minTemperature = temperatureVal;
			}
		}

		// Assert
		Assert.assertEquals(minTemperature, wController.getTemperatureMinFromCache(), 0.001);
	}

	@Test
	public void testTemperatureMax() {
		System.out.println("+++ testTemperatureMax +++");

		// Act
		double maxTemperature = -1;
		for (int i = 0; i < nHours; i++) {
			double temperatureVal = wController.getTemperatureForHour(i + 1);
			if (maxTemperature < temperatureVal) {
				maxTemperature = temperatureVal;
			}
		}

		// Assert
		Assert.assertEquals(maxTemperature, wController.getTemperatureMaxFromCache(), 0.001);
	}

	@Test
	public void testTemperatureAverage() {
		System.out.println("+++ testTemperatureAverage +++");

		// Act
		double sumTemp = 0;
		for (int i = 0; i < nHours; i++) {
			double temperatureVal = wController.getTemperatureForHour(i + 1);
			sumTemp += temperatureVal;
		}
		double averageTemp = sumTemp / nHours;

		// Assert
		Assert.assertEquals(averageTemp, wController.getTemperatureAverageFromCache(), 0.001);
	}

	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		Assert.assertTrue(persistTime.equals(now));
	}
}
