package web.model;

public class Car {
	private int id;
	private String model;
	private int series;

	public Car() {
	}

	public Car(int id, String model, int series) {
		this.id = id;
		this.model = model;
		this.series = series;
	}

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public int getSeries() {
		return series;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "Car{" +
				"id=" + id +
				", model='" + model + '\'' +
				", series=" + series +
				'}';
	}
}
