package org.hima.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	private SpellChecker spellChecker;
	@Autowired
	private NumberCheck numberCheck ;
	private String name;

	public TextEditor(){
	}
	/*constructor based dependency injection*/
	//@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}
	
	public TextEditor(NumberCheck numberCheck) {
		System.out.println("Inside TextEditor number constructor.");
		this.numberCheck = numberCheck;
	}

	/*setter based dependency injection*/
	//@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside Setter method of TextEditor ");
		this.spellChecker = spellChecker;
	}

	public NumberCheck getNumberCheck() {
		return numberCheck;
	}
	public void setNumberCheck(NumberCheck numberCheck) {
		System.out.println("Inside Setter method of number TextEditor ");
		this.numberCheck = numberCheck;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	public void readCount() {
		numberCheck.readCount();
	}
}
