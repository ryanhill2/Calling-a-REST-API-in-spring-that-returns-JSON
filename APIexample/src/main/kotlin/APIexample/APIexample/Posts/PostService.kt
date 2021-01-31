package APIexample.APIexample.Posts

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import kotlin.reflect.typeOf


@Service
class PostService {

    fun getposts(): Any {
        var url: String = "https://jsonplaceholder.typicode.com/posts"
        val restTemplate = RestTemplate()
        return restTemplate.getForEntity(url, String::class.java)
    }
}