package br.com.jeancsanchez.restinterceptor

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.spy
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat

open class BaseTest {

    private val interceptor = RestErrorInterceptor()
    val request: Request = Request.Builder().url(FAKE_URL).build()
    val response = mock<Response>()
    private val call = mock<Call> { on { execute() } doReturn  response }
    val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
        .let { spy(it) { on { newCall(any()) } doReturn call } }

    companion object {
        const val FAKE_URL = "https://fakeurl.com"
    }

}

typealias RestError = br.com.jeancsanchez.restinterceptor.errors.Error

inline fun <reified T : RestError> Throwable.isInstanceOf() {
    assertThat(this, instanceOf(T::class.java))
}
