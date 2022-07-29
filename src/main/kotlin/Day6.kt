// HTTP requests
// need to add dependencies in here to use kdelete

import javafx.application.Application.launch
import java.io.InputStream
import javax.xml.ws.Response
import khttp
import java.io.File


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

class test {
    fun add() {
        try {
            var add: Int? = null
            add?.plus(1)
        }
        catch (e: NullPointerException) {

        }
    }
}
// Basic thing is threads - https://youtu.be/lmRzRKIsn1g
// coroutine - lightweight thread to process asynchronous
// it can be paused and resumed dynamically

// launch is used to start and stop a coroutine
// The async keyword is used to initiate a coroutine that computes a result.
class Coroutine {
    // runs in the main thread
    fun ThreadExample() {
        val job: Job = launch {
            delay(1000)
        }
        job.join()
    }

    GlobalScope.launch {
        delay(2000)
    }
}


class SlidingWindow {
    fun slide() {
        val array = (1..10).toList()
        val window = array.windowed(3, 1, true) {
            it.joinToString(", ")
        }
        println(window)
    }
}

// learn all the concepts with clear understanding
// know why, when and how to use  those concepts
data class Sample(var first: String, var second: String) {
    fun add() {
        val self: String? = null
        self?.length
        self!!.length
    }
}

sealed class yellow {
    val name = "hello"
    class first {
        fun print() {
            println(name) // cannot read
        }
    }
    inner class second {
        fun print() {
            println(name) // can read
        }
    }
}