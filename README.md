# 3dque_tech_assignment

This implementation takes in GET /reverse/< string > and reverses < string >.

ie. /reverse/hello, returns olleh

We assume that non-alphabetical characters also gets taken in as a string, and is also reversed.

ie. /reverse/1-2-3, returns 3-2-1

Though the unit test tests for this and passes, note that special characters for URLs, such as ";", "?", and "#" will cut off letters after the character. This is because these characters are reserved to note the end of an URL, or add in additional parameters.

ie. /reverse/hello?this, returns only olleh

Strings containing unsafe characters such as "^", "%", "]" and "[" will return a 400 Bad Request.
