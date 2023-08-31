package practice;

public class BackgroundChangeListener implements CheckBox.OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("Change background.");
	}
}
