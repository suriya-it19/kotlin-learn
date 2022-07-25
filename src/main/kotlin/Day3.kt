import java.io.FileWriter

/*
Threads are same as in java, it process the same way by inheriting
and overriding the run method
*/

// Inheriting Thread class and overriding run
class SampleThread: Thread() {
    override fun run() {
        println("Running in ${Thread.currentThread()}")
        temp("temperature")
    }
}

// Implementing Interface through runnable
class SampleThreadInter: Runnable {
    override fun run() {
        println("Running in ${Thread.currentThread()}")
        temp("blood")
    }
}

fun main(args: Array<String>) {
    // Thread class
    val thread = SampleThread()
    thread.start()
    thread.join()

    // Runnable interface
    val threadRunnable = Thread(SampleThreadInter())
    threadRunnable.start()
    thread.join()

    // lambda
    val threadL = Thread {
        println("${Thread.currentThread()} has run.")
        temp("blue")
    }
    threadL.start()

}

fun temp(like: String = "hi") {
    if(like.isEmpty())
        return
    temp(like.substring(0, like.length-1))
    println(like)


    /*
    autocloseable - methods deletes all the things inside it once done
    closeable - explicitly create things in a closeable environment
    */

    var writer = FileWriter("text.txt")
    writer.use {
        it.write("the content to be inside the text document")
    }

    FileWriter("text.txt")
        .use {
                writer -> writer.write("the content to be inside the text document")
        }

    FileWriter("text.txt")
        .use {
            it.write("the content to be inside the text document")
        }


}