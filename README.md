# 3dque_tech_assignment

This implementation takes in GET /reverse/< string > and reverses < string >.

ie. /reverse/hello, returns olleh

We assume that non-alphabetical characters also gets taken in as a string, and is also reversed.

ie. /reverse/1-2-3, returns 3-2-1

Though the unit test tests for this and passes, note that special characters for URLs, such as ";", "?", and "#" will cut off letters after the character. This is because these characters are reserved to note the end of an URL, or add in additional parameters.

ie. /reverse/hello?this, returns only olleh

Strings containing unsafe characters such as "^", "%", "]" and "[" will return a 400 Bad Request.

To run the project, first make sure you have Maven installed locally. Maven installation instructions can be found: https://maven.apache.org/install.html. If on Mac and homebrew is installed, Maven can be installed by running "brew install maven".

Go to terminal and ensure you are in this project file directory: */3dque

Run the following command: mvn spring-boot:run

Open a browser of your choice and go to localhost:8080/reverse/{string}, where {string} is a word or string of characters of your choice.
