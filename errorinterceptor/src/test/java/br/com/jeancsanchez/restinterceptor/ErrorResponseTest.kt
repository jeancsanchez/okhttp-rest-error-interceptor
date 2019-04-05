package br.com.jeancsanchez.restinterceptor

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test

class ErrorResponseTest : BaseTest() {

    @Test fun `make a request and receive bad request status code`() {
        whenever(response.code()) doReturn 400
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isBadRequest() }
    }

    @Test fun `make a request and receive unauthorized status code`() {
        whenever(response.code()) doReturn 401
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isUnauthorized() }
    }

    @Test fun `make a request and receive forbidden status code`() {
        whenever(response.code()) doReturn 403
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isForbidden() }
    }

    @Test fun `make a request and receive not found status code`() {
        whenever(response.code()) doReturn 404
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isNotFound() }
    }

    @Test fun `make a request and receive method not allowed status code`() {
        whenever(response.code()) doReturn 405
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isMethodNotAllowed() }
    }

    @Test fun `make a request and receive internal server error status code`() {
        whenever(response.code()) doReturn 500
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isInteralServerError() }
    }

    @Test fun `make a request and receive bad gateway status code`() {
        whenever(response.code()) doReturn 502
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isBadGateway() }
    }

    @Test fun `make a request and receive service unavailable status code`() {
        whenever(response.code()) doReturn 502
        try { client.newCall(request).execute() }
        catch (throwable: Throwable) { throwable.isServiceUnavailable() }
    }

}