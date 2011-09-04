package javaEssentials.examples;

public class ExampleIO {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ExampleIO() {
		this("I'm a simple program!");
	}

	public ExampleIO(String text) {
		setText(text);
	}
}
