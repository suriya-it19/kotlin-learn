// HTTP requests
// need to add dependencies in here to use kdelete

import java.io.InputStream
import javax.xml.ws.Response
import khttp


fun main(args: Array<String>) {
    // simple request
    khttp.get("http://httpbin.org/get")

// request with parameter
    khttp.get(
        url = "http://httpbin.org/get",
        params = mapOf("first" to "second", "firstf" to "secondd")
    ) // request will be like - http://httpbin.org/get?key1=value1&keyn=valuen


// request with json payload
    khttp.post(
        url = "http://httpbin.org/post",
        json = mapOf("key1" to "value1", "key2" to "value2")
    )

// Uploading Files
    khttp.post(
        url = "http://httpbin.org/post",
        files = listOf(
            FileLike("file1", "content1"),
            FileLike("file2", File("kittly.jpg"))
        )
    )


// Response

// Json response
    val response: Response = khttp.get("http://httpbin.org/get")
    val obj: JSONObject = response.jsonObject
    println(obj["someProperty"])

    val message: String = response.text
    val imageData: ByteArray = response.content
    val inputStream: InputStream = response.raw


    // better to handle the error
    val response = khttp.get(url = "http://httpbin.org/nothing/to/see/here")
    var value: Any = if (response.statusCode == 200) {
        process(response)
    } else {
        handleError(response)
    }
}