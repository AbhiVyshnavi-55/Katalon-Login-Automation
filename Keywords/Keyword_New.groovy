import com.kms.katalon.core.annotation.Keyword

public class Keyword_New {
	
	@Keyword
	def hello() {
		
		println "Hello Bye"
	}

	@Keyword
	def greetings(String user) {
		
		println("Hey " +user)
	}
}
