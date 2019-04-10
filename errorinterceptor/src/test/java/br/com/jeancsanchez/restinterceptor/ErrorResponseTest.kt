package br.com.jeancsanchez.restinterceptor

import br.com.jeancsanchez.restinterceptor.errors.BadGateway
import br.com.jeancsanchez.restinterceptor.errors.BadRequest
import br.com.jeancsanchez.restinterceptor.errors.Forbidden
import br.com.jeancsanchez.restinterceptor.errors.InternalServerError
import br.com.jeancsanchez.restinterceptor.errors.MethodNotAllowed
import br.com.jeancsanchez.restinterceptor.errors.NotFound
import br.com.jeancsanchez.restinterceptor.errors.ServiceUnavailable
import br.com.jeancsanchez.restinterceptor.errors.Unauthorized
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test

class ErrorResponseTest : BaseTest() {

    @Test fun `make a request and receive bad request status code`() {
        whenever(response.code()) doReturn 400
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<BadRequest>() }
    }

    @Test fun `make a request and receive unauthorized status code`() {
        whenever(response.code()) doReturn 401
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<Unauthorized>() }
    }

    @Test fun `make a request and receive forbidden status code`() {
        whenever(response.code()) doReturn 403
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<Forbidden>() }
    }

    @Test fun `make a request and receive not found status code`() {
        whenever(response.code()) doReturn 404
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<NotFound>() }
    }

    @Test fun `make a request and receive method not allowed status code`() {
        whenever(response.code()) doReturn 405
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<MethodNotAllowed>() }
    }

    @Test fun `make a request and receive internal server error status code`() {
        whenever(response.code()) doReturn 500
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<InternalServerError>() }
    }

    @Test fun `make a request and receive bad gateway status code`() {
        whenever(response.code()) doReturn 502
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<BadGateway>() }
    }

    @Test fun `make a request and receive service unavailable status code`() {
        whenever(response.code()) doReturn 502
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInstanceOf<ServiceUnavailable>() }
    }

}