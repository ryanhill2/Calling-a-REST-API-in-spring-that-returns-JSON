package APIexample.APIexample.Posts

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class PostController(val postService: PostService) {

    @GetMapping("posts")
    fun getposts(): Any {
        return postService.getposts()
    }
}