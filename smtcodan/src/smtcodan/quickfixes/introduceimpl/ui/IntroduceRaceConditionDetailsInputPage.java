package smtcodan.quickfixes.introduceimpl.ui;

import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import smtcodan.quickfixes.introduceimpl.IntroduceRaceConditionInformation;

// TODO: Auto-generated Javadoc
/**
 * The Class IntroduceBufferOverflowDetailsInputPage.
 */
public class IntroduceRaceConditionDetailsInputPage extends UserInputWizardPage {

	/** The pointer name text. */
	public Text fixText;

	/**
	 * Gets the fix text.
	 * 
	 * @return the fix text
	 */
	public String getFixText() {
		return fixText.getText();
	}

	/**
	 * Sets the fix text.
	 * 
	 * @param fixText1
	 *            the new fix text
	 */
	public void setFixText(String fixText1) {
		fixText.setText(fixText1);
		setMessages();

	}

	/** The info. */
	private IntroduceRaceConditionInformation info;

	/**
	 * Instantiates a new introduce buffer overflow details input page.
	 * 
	 * @param name
	 *            the name
	 * @param info
	 *            the info
	 */
	public IntroduceRaceConditionDetailsInputPage(String name,
			IntroduceRaceConditionInformation info) {
		super(name);
		this.info = info;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createControl(Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		setControl(result);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		result.setLayout(layout);

		GridData textData = new GridData(GridData.FILL_HORIZONTAL);
		textData.grabExcessHorizontalSpace = true;
		createFixLabel(result, textData);

	}

	/**
	 * Creates the pointer name label.
	 * 
	 * @param result
	 *            the result
	 * @param textData
	 *            the text data
	 */
	private void createFixLabel(Composite result, GridData textData) {
		Label fixLabel = new Label(result, SWT.NONE);
		fixLabel.setText("REFACTORY " + ":");
		fixText = new Text(result, SWT.NONE);
		fixText.setLayoutData(textData);
	}

	/**
	 * Sets the messages.
	 */
	private void setMessages() {
		setPageComplete();

	}

	/**
	 * Sets the page complete.
	 */
	private void setPageComplete() {
		setPageComplete(true);

	}

}