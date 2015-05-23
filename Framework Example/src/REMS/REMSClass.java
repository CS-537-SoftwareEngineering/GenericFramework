package REMS;

public class REMSClass {
	private double REMS_VERTICAL_WINDSPEED_MIN;
	private double REMS_VERTICAL_WINDSPEED;
	private double REMS_VERTICAL_WINDSPEED_MAX;
	private double REMS_HORIZONTAL_WINDSPEED_MIN;
	private double REMS_HORIZONTAL_WINDSPEED;
	private double REMS_HORIZONTAL_WINDSPEED_MAX;
	private double REMS_GROUDTEMP_MIN;
	private double REMS_GROUNDTEMP_MAX;
	private double REMS_GROUNDTEMP;
	private double REMS_AIRTEMP;
	private double REMS_AIRTEMP_MIN;
	private double REMS_AIRTEMP_MAX;
	private double REMS_PRESSURE;
	private double REMS_ULTRAVIOLET;
	private double REMS_HUMIDITY;
	private double REMS_HUMIDITY_MIN;
	private double REMS_HUMIDITY_MAX;
	public final String  REMS_STATUS;

	/**
	 * @param rEMS_WINDSPEED_MIN
	 * @param rEMS_WINDSPEED
	 * @param rEMS_WINDSPEED_MAX
	 * @param rEMS_GROUDTEMP_MIN
	 * @param rEMS_GROUNDTEMP_MAX
	 * @param rEMS_GROUNDTEMP
	 * @param rEMS_AIRTEMP
	 * @param rEMS_AIRTEMP_MIN
	 * @param rEMS_AIRTEMP_MAX
	 * @param rEMS_PRESSURE
	 * @param rEMS_ULTRAVIOLET
	 * @param rEMS_HUMIDITY
	 * @param rEMS_HUMIDITY_MIN
	 * @param rEMS_HUMIDITY_MAX
	 */
	public REMSClass(double rEMS_VERTICAL_WINDSPEED_MIN,
			double rREMS_VERTICAL_WINDSPEED,
			double rREMS_VERTICAL_WINDSPEED_MAX,
			double rEMS_HORIZONTAL_WINDSPEED_MIN,
			double rREMS_HORIZONTAL_WINDSPEED,
			double rREMS_HORIZONTAL_WINDSPEED_MAX, double rEMS_GROUDTEMP_MIN,
			double rEMS_GROUNDTEMP_MAX, double rEMS_GROUNDTEMP,
			double rEMS_AIRTEMP, double rEMS_AIRTEMP_MIN,
			double rEMS_AIRTEMP_MAX, double rEMS_PRESSURE,
			double rEMS_ULTRAVIOLET, double rEMS_HUMIDITY,
			double rEMS_HUMIDITY_MIN, double rEMS_HUMIDITY_MAX, String rEMS_STATUS) {

		REMS_VERTICAL_WINDSPEED_MIN = rEMS_VERTICAL_WINDSPEED_MIN;
		REMS_VERTICAL_WINDSPEED = rREMS_VERTICAL_WINDSPEED;
		REMS_VERTICAL_WINDSPEED_MAX = rREMS_VERTICAL_WINDSPEED_MAX;
		REMS_HORIZONTAL_WINDSPEED_MIN = rEMS_HORIZONTAL_WINDSPEED_MIN;
		REMS_HORIZONTAL_WINDSPEED = rREMS_HORIZONTAL_WINDSPEED;
		REMS_HORIZONTAL_WINDSPEED_MAX = rREMS_HORIZONTAL_WINDSPEED_MAX;
		REMS_GROUDTEMP_MIN = rEMS_GROUDTEMP_MIN;
		REMS_GROUNDTEMP_MAX = rEMS_GROUNDTEMP_MAX;
		REMS_GROUNDTEMP = rEMS_GROUNDTEMP;
		REMS_AIRTEMP = rEMS_AIRTEMP;
		REMS_AIRTEMP_MIN = rEMS_AIRTEMP_MIN;
		REMS_AIRTEMP_MAX = rEMS_AIRTEMP_MAX;
		REMS_PRESSURE = rEMS_PRESSURE;
		REMS_ULTRAVIOLET = rEMS_ULTRAVIOLET;
		REMS_HUMIDITY = rEMS_HUMIDITY;
		REMS_HUMIDITY_MIN = rEMS_HUMIDITY_MIN;
		REMS_HUMIDITY_MAX = rEMS_HUMIDITY_MAX;
		REMS_STATUS = rEMS_STATUS;
	}


	/**
	 * @return the rEMS_VERTICAL_WINDSPEED_MIN
	 */
	public double getREMS_VERTICAL_WINDSPEED_MIN() {
		return REMS_VERTICAL_WINDSPEED_MIN;
	}

	/**
	 * @param rEMS_VERTICAL_WINDSPEED_MIN
	 *            the rEMS_VERTICAL_WINDSPEED_MIN to set
	 */
	public void setREMS_VERTICAL_WINDSPEED_MIN(
			double rEMS_VERTICAL_WINDSPEED_MIN) {
		REMS_VERTICAL_WINDSPEED_MIN = rEMS_VERTICAL_WINDSPEED_MIN;
	}

	/**
	 * @return the rEMS_VERTICAL_WINDSPEED
	 */
	public double getREMS_VERTICAL_WINDSPEED() {
		return REMS_VERTICAL_WINDSPEED;
	}

	/**
	 * @param rEMS_VERTICAL_WINDSPEED
	 *            the rEMS_VERTICAL_WINDSPEED to set
	 */
	public void setREMS_VERTICAL_WINDSPEED(double rEMS_VERTICAL_WINDSPEED) {
		REMS_VERTICAL_WINDSPEED = rEMS_VERTICAL_WINDSPEED;
	}

	/**
	 * @return the rEMS_VERTICAL_WINDSPEED_MAX
	 */
	public double getREMS_VERTICAL_WINDSPEED_MAX() {
		return REMS_VERTICAL_WINDSPEED_MAX;
	}

	/**
	 * @param rEMS_VERTICAL_WINDSPEED_MAX
	 *            the rEMS_VERTICAL_WINDSPEED_MAX to set
	 */
	public void setREMS_VERTICAL_WINDSPEED_MAX(
			double rEMS_VERTICAL_WINDSPEED_MAX) {
		REMS_VERTICAL_WINDSPEED_MAX = rEMS_VERTICAL_WINDSPEED_MAX;
	}

	/**
	 * @return the rEMS_HORIZONTAL_WINDSPEED_MIN
	 */
	public double getREMS_HORIZONTAL_WINDSPEED_MIN() {
		return REMS_HORIZONTAL_WINDSPEED_MIN;
	}

	/**
	 * @param rEMS_HORIZONTAL_WINDSPEED_MIN
	 *            the rEMS_HORIZONTAL_WINDSPEED_MIN to set
	 */
	public void setREMS_HORIZONTAL_WINDSPEED_MIN(
			double rEMS_HORIZONTAL_WINDSPEED_MIN) {
		REMS_HORIZONTAL_WINDSPEED_MIN = rEMS_HORIZONTAL_WINDSPEED_MIN;
	}

	/**
	 * @return the rEMS_HORIZONTAL_WINDSPEED
	 */
	public double getREMS_HORIZONTAL_WINDSPEED() {
		return REMS_HORIZONTAL_WINDSPEED;
	}

	/**
	 * @param rEMS_HORIZONTAL_WINDSPEED
	 *            the rEMS_HORIZONTAL_WINDSPEED to set
	 */
	public void setREMS_HORIZONTAL_WINDSPEED(double rEMS_HORIZONTAL_WINDSPEED) {
		REMS_HORIZONTAL_WINDSPEED = rEMS_HORIZONTAL_WINDSPEED;
	}

	/**
	 * @return the rEMS_HORIZONTAL_WINDSPEED_MAX
	 */
	public double getREMS_HORIZONTAL_WINDSPEED_MAX() {
		return REMS_HORIZONTAL_WINDSPEED_MAX;
	}

	/**
	 * @param rEMS_HORIZONTAL_WINDSPEED_MAX
	 *            the rEMS_HORIZONTAL_WINDSPEED_MAX to set
	 */
	public void setREMS_HORIZONTAL_WINDSPEED_MAX(
			double rEMS_HORIZONTAL_WINDSPEED_MAX) {
		REMS_HORIZONTAL_WINDSPEED_MAX = rEMS_HORIZONTAL_WINDSPEED_MAX;
	}

	/**
	 * @return the rEMS_GROUDTEMP_MIN
	 */
	public double getREMS_GROUDTEMP_MIN() {
		return REMS_GROUDTEMP_MIN;
	}

	/**
	 * @param rEMS_GROUDTEMP_MIN
	 *            the rEMS_GROUDTEMP_MIN to set
	 */
	public void setREMS_GROUDTEMP_MIN(double rEMS_GROUDTEMP_MIN) {
		REMS_GROUDTEMP_MIN = rEMS_GROUDTEMP_MIN;
	}

	/**
	 * @return the rEMS_GROUNDTEMP_MAX
	 */
	public double getREMS_GROUNDTEMP_MAX() {
		return REMS_GROUNDTEMP_MAX;
	}

	/**
	 * @param rEMS_GROUNDTEMP_MAX
	 *            the rEMS_GROUNDTEMP_MAX to set
	 */
	public void setREMS_GROUNDTEMP_MAX(double rEMS_GROUNDTEMP_MAX) {
		REMS_GROUNDTEMP_MAX = rEMS_GROUNDTEMP_MAX;
	}

	/**
	 * @return the rEMS_GROUNDTEMP
	 */
	public double getREMS_GROUNDTEMP() {
		return REMS_GROUNDTEMP;
	}

	/**
	 * @param rEMS_GROUNDTEMP
	 *            the rEMS_GROUNDTEMP to set
	 */
	public void setREMS_GROUNDTEMP(double rEMS_GROUNDTEMP) {
		REMS_GROUNDTEMP = rEMS_GROUNDTEMP;
	}

	/**
	 * @return the rEMS_AIRTEMP
	 */
	public double getREMS_AIRTEMP() {
		return REMS_AIRTEMP;
	}

	/**
	 * @param rEMS_AIRTEMP
	 *            the rEMS_AIRTEMP to set
	 */
	public void setREMS_AIRTEMP(double rEMS_AIRTEMP) {
		REMS_AIRTEMP = rEMS_AIRTEMP;
	}

	/**
	 * @return the rEMS_AIRTEMP_MIN
	 */
	public double getREMS_AIRTEMP_MIN() {
		return REMS_AIRTEMP_MIN;
	}

	/**
	 * @param rEMS_AIRTEMP_MIN
	 *            the rEMS_AIRTEMP_MIN to set
	 */
	public void setREMS_AIRTEMP_MIN(double rEMS_AIRTEMP_MIN) {
		REMS_AIRTEMP_MIN = rEMS_AIRTEMP_MIN;
	}

	/**
	 * @return the rEMS_AIRTEMP_MAX
	 */
	public double getREMS_AIRTEMP_MAX() {
		return REMS_AIRTEMP_MAX;
	}

	/**
	 * @param rEMS_AIRTEMP_MAX
	 *            the rEMS_AIRTEMP_MAX to set
	 */
	public void setREMS_AIRTEMP_MAX(double rEMS_AIRTEMP_MAX) {
		REMS_AIRTEMP_MAX = rEMS_AIRTEMP_MAX;
	}

	/**
	 * @return the rEMS_PRESSURE
	 */
	public double getREMS_PRESSURE() {
		return REMS_PRESSURE;
	}

	/**
	 * @param rEMS_PRESSURE
	 *            the rEMS_PRESSURE to set
	 */
	public void setREMS_PRESSURE(double rEMS_PRESSURE) {
		REMS_PRESSURE = rEMS_PRESSURE;
	}

	/**
	 * @return the rEMS_ULTRAVIOLET
	 */
	public double getREMS_ULTRAVIOLET() {
		return REMS_ULTRAVIOLET;
	}

	/**
	 * @param rEMS_ULTRAVIOLET
	 *            the rEMS_ULTRAVIOLET to set
	 */
	public void setREMS_ULTRAVIOLET(double rEMS_ULTRAVIOLET) {
		REMS_ULTRAVIOLET = rEMS_ULTRAVIOLET;
	}

	/**
	 * @return the rEMS_HUMIDITY
	 */
	public double getREMS_HUMIDITY() {
		return REMS_HUMIDITY;
	}

	/**
	 * @param rEMS_HUMIDITY
	 *            the rEMS_HUMIDITY to set
	 */
	public void setREMS_HUMIDITY(double rEMS_HUMIDITY) {
		REMS_HUMIDITY = rEMS_HUMIDITY;
	}

	/**
	 * @return the rEMS_HUMIDITY_MIN
	 */
	public double getREMS_HUMIDITY_MIN() {
		return REMS_HUMIDITY_MIN;
	}

	/**
	 * @param rEMS_HUMIDITY_MIN
	 *            the rEMS_HUMIDITY_MIN to set
	 */
	public void setREMS_HUMIDITY_MIN(double rEMS_HUMIDITY_MIN) {
		REMS_HUMIDITY_MIN = rEMS_HUMIDITY_MIN;
	}

	/**
	 * @return the rEMS_HUMIDITY_MAX
	 */
	public double getREMS_HUMIDITY_MAX() {
		return REMS_HUMIDITY_MAX;
	}

	/**
	 * @param rEMS_HUMIDITY_MAX
	 *            the rEMS_HUMIDITY_MAX to set
	 */
	public void setREMS_HUMIDITY_MAX(double rEMS_HUMIDITY_MAX) {
		REMS_HUMIDITY_MAX = rEMS_HUMIDITY_MAX;
	}

}
