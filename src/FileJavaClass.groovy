/*
 * This is a groovy code converted from the java class created earlier FirstJavaClass.java
 * Everything is public so public access modifier is not required
 * By default variable are private in access modifier so remove them
 * no need for the 'semi colons' its optional
 * Getter & Setters are implicitely defined so remove them
 */

 class FirstJavaClass {
 	  def name
	  def Success(){
		 return "Hello ${name}"
	 }
      static void main(String[] arg) {
		 def fj = new FirstJavaClass()
		 //fj.setName("Java to Groovy")
		 fj.name = "Okram"
		 
		 println(fj.Success())
	 }
 }
 