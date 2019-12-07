package reverse_string;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/reverse/")
@RestController
public class Controller {
    String NO_STRING_MESSAGE = "No string input. Please try again.";

    // Root Response
    @GetMapping
    public String noValue()
    {
        return NO_STRING_MESSAGE;
    }

    @GetMapping(value = "{word}")
    public String reverseString(@PathVariable("word") String word)
    {
            return new StringManager().reverseString(word);
    }

}
