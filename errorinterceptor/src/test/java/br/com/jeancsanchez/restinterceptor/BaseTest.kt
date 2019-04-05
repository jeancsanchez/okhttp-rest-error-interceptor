package br.com.jeancsanchez.restinterceptor

import br.com.jeancsanchez.restinterceptor.errors.BadGateway
import br.com.jeancsanchez.restinterceptor.errors.BadRequest
import br.com.jeancsanchez.restinterceptor.errors.Forbidden
import br.com.jeancsanchez.restinterceptor.errors.InternalServerError
import br.com.jeancsanchez.restinterceptor.errors.MethodNotAllowed
import br.com.jeancsanchez.restinterceptor.errors.NotFound
import br.com.jeancsanchez.restinterceptor.errors.ServiceUnavailable
import br.com.jeancsanchez.restinterceptor.errors.Unauthorized
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

fun Throwable.isBadRequest() =
    assertThat(this, instanceOf(BadRequest::class.java))

fun Throwable.isUnauthorized() =
    assertThat(this, instanceOf(Unauthorized::class.java))

fun Throwable.isForbidden() =
    assertThat(this, instanceOf(Forbidden::class.java))

fun Throwable.isNotFound() =
    assertThat(this, instanceOf(NotFound::class.java))

fun Throwable.isMethodNotAllowed() =
    assertThat(this, instanceOf(MethodNotAllowed::class.java))

fun Throwable.isInteralServerError() =
    assertThat(this, instanceOf(InternalServerError::class.java))

fun Throwable.isBadGateway() =
    assertThat(this, instanceOf(BadGateway::class.java))

fun Throwable.isServiceUnavailable() =
    assertThat(this, instanceOf(ServiceUnavailable::class.java))