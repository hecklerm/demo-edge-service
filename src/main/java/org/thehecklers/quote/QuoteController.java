package org.thehecklers.quote;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by markheckler on 2/16/16.
 */
@RestController
public class QuoteController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/quotorama")
    @HystrixCommand(fallbackMethod = "getRandomQuoteFallback")
    public Quote getRandomQuote() {
        return restTemplate.getForObject("http://QUOTE-SERVICE/random", Quote.class);
    }

    public Quote getRandomQuoteFallback() {
        return new Quote("It doesn't take all kinds to make the world go 'round, but they're all here.", "",
                new QuoteSource("Mark Heckler", "Amateur philosopher and student of life"));
    }
}
