@RestController
class HelloworldController {
	@RequestMapping("/")
	String sayHello() {
		return "Hello World!"
	}

}
