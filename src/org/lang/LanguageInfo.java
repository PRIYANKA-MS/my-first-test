package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamillanguage() {
		System.out.println("TAMIL");
		}
		private void englishlanguage() {
		System.out.println("ENGLISH");

		}
		private void hindilanguage() {
		System.out.println("HINDI");
		}
		
	public static void main(String[] args) {
		LanguageInfo i= new LanguageInfo();
		i.tamillanguage();
		i.englishlanguage();
		i.hindilanguage();
		i.southIndia();
		i.northIndia();
	
	}
}
