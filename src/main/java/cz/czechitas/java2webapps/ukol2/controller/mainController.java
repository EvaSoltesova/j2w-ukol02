package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class mainController {

    private final Random random = new Random();

    List<String> seznamCitatu= Arrays.asList("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
            "A user interface is like a joke. If you have to explain it, it's not that good.",
            "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
            "I have a joke on programming but it only works on my computer.",
            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
            "Programmer (noun.): A machine that turns coffee into code.",
            "Real programmers count from 0.");


    @GetMapping("/")

    public ModelAndView citatSObrazkem() {

    int nahodneCislo = random.nextInt(8) + 1;

    ModelAndView result = new ModelAndView("CitatSObrazkem");
    result.addObject("citat",seznamCitatu.get(nahodneCislo));
    result.addObject("obrazek",String.format("/image/obrazek-%d.jpg",nahodneCislo));
    return result;
    }
}
